# EMPLOYEE-MANAGEMENT-REST-WEB-SERVICES-USING-SPRING-BOOT---FLYWAY-DATASOURCE


EMPLOYEE MANAGEMENT RESTFUL WEB SERVICE USING SPRINGBOOT AND FLYWAY :
-----------------------------------------------------------------------------------------------------------------------------




  PRE REQUISITES 
---------------------------


Languages to be known : 
                       
                       Java 
                       SQL 
                       
Frameworks to be familiarised : 

                              Spring Boot with Gradle
                              Datasource

Web Service to be familiarised :

                                RESTful Web Service
				
Database Migration performed using : Flyway.				
                                
Installations :

    IDE to be installed    : Download and install IntelliJ IDEA from https://www.jetbrains.com/idea/download/#section=mac .
    
    Database requirements  : Download and install MySQL 8.0.12 from https://dev.mysql.com/downloads/mysql/ .
                             Download and install MySQL Workbench from https://dev.mysql.com/downloads/workbench/ .
    
    Open the MySQL.prefpane and give the user name and password for the server. Configure the Workbench localhost by connecting it with the MySQL server giving the user name and password.
    
    REST Web Service Requirements : Download and install Postman from https://www.getpostman.com/apps



Downloading the project from GitHub :
     
    Navigate to the repository’s Code tab.
    
    Click Clone or download.
    
    Copy the URL provided.
    
    Open your command line or Terminal application and enter the directory where you would like to copy the repository : cd ~/
    
    Clone the repository by replacing <URL> with clone URL you copied in the previous step. The repository will be cloned into a new directory in this location :  git clone <URL>
     
    Navigate into the directory of the repository you just created. Replace with your own repository's name :  
    cd <REPOSITORY-NAME>
    
    Type : git status ,to verify the current state of your repository and the files it contains. 
    
    
    
Configurations : 

        Give the configurations of your databse including your datasource url, user name and password in application.properties in your : employee90/src/main/resources/application.properties




                        
 COMPILING AND EXECUTING 
----------------------------------



In MySQL.prefpane :

     Start the mysql server in MySQL MYSQL.prefpane . 



In the MySQLWokrkbench : 
  
     First create a database named employee using the query :
     CREATE SCHEMA `employee` ;
                                                                         
     Then create the table employeez in the database employeez using the query : (These steps are not needed when we are using Flyway, this can be done during versioning of data. Version 1 creates the tale)


    CREATE TABLE `employee`.`employeedata` (
    `id` INT GENERATED ALWAYS AS (),
    `name` VARCHAR(45) NOT NULL,
    `salary` VARCHAR(45) NOT NULL,
     PRIMARY KEY (`id`));


 In IntelliJ IDEA :

     Build the project, in the terminal using : ./gradlew build or click gradle tab and then click /Task/build .
      
      
 ![Screenshot](https://github.com/soniamathew/EmployeeManagement-using-SpringBoot-and-Hibernate/blob/master/1.png)
    
     
     
     Run the Employee Application.
   
  ![Screenshot](https://github.com/soniamathew/EmployeeManagement-using-SpringBoot-and-Hibernate/blob/master/2.png)
     
     
     Then the SpringBoot Application class will be run, tomcat will get started on port 9000 and mysql connection is also          made.


 In Postman :

     Make the Rest API requests as follows :-
     
     CRUD OPERATIONS :   (CREATE, READ BY ID, UPDATE AND DELETE BY ID)
     
     Create : 
             method : POST , API endpoint : http://localhost:9000/employee/api/create
          Code : 
                POST /employee/api/create HTTP/1.1
                Host: localhost:9000
                Content-Type: application/json
                Cache-Control: no-cache
                Postman-Token: 02501aeb-102a-4260-8424-e5f3e22dbb50

                {
                "name"   : <"mention the name">,
                "salary" : <mention the salary>
                }
     
     Read : 
           method : GET , API endpoint : http://localhost:9000/employee/api/read/{id}              -give the id.
        Code : 
             GET /employee/api/read/<mention the id> HTTP/1.1
             Host: localhost:9000
             Cache-Control: no-cache
             Postman-Token: d5c92f46-ff9c-4b92-a59e-999124f734df
        
        
     Update : 
           method : PUT , API endpoint : http://localhost:9000/employee/api/update
       Code : 
             PUT /employee/api/update HTTP/1.1
             Host: localhost:9000
             Content-Type: application/json
             Cache-Control: no-cache
             Postman-Token: a924eca8-6f9e-453d-9989-484732b7f08d

             {
	           "id"     : <mention the id>,
	           "name"   : <"mention the name">,
	           "salary" : <mention the salary>
             }
    
    
    Delete : 
           method : DELETE , API endpoint : http://localhost:9000/employee/api/delete/{id}         -give the id.
      Code : 
            DELETE /employee/api/delete/<mention the id> HTTP/1.1
            Host: localhost:9000
            Cache-Control: no-cache
            Postman-Token: ec7792b5-e737-4163-ae26-c7b21c2d3913
            Content-Type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW


     
     After hitting the Rest APIs and the MySQL database, the results wil be displayed in postman as well as console of the IntelliJ IDEA.


DataBase Migrations using Flyway : 

     For this we can make use of Flyway. Flyway is a data migration tool. For this we have created a db/migration folder in resoures of the project . We can use DDL and DML commands for data migration. We are performing migration using versioning. In the beginning we are creating the database table using the Create query in V1__employee.sql, as we build the project the MySQL connections will be made and we can perform the first version. Since we are using flyway a flyway_schema_history table will be created automatically it shows the history of the versioning when we view the table.The table has a checksum that differentiates between each version. The success or failure of a version can also be found in the table.
     In version 2, we are adding a column to the table . Then in version 3, we are renaming the table.


