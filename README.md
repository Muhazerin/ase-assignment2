# ASE Assignment2 Group 29
Website url: `http://localhost:8080/assignment2/index.jsp`
![](https://i.imgur.com/1psyGWF.gif)
## Project Setup
### Requirements
* Java SE 16
* maven 3.8.1
* MySQL 8.0.23
* MySQL Workbench 8.0.23
## Loading script into database
1. Open Workbench
2. Click File > Open SQL Script
3. Open db.sql
4. Run all the queries
## Changing the database username and password
1. Inside src/main/java/org/grp29/ase/service/MySqlDAO.java
2. Find the comment `your database username` and change username
3. Find the comment `your database password` and change password
## Running the application
1. run `mvn jetty:run` in command prompt