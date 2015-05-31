****README File for Shipments Repository
****Version: 1.0, May 30, 2015

****Overview
The Shipments repository consists of a job that is designed to extract DHL shipping data from an Excel sheet and store it in a database. 

****Technical Details

1) The job is being developed in Eclipse.
2) Java is the programming language.
3) The database used is Postresql.
4) JDBC connection to the database.
5) Maven is used to resolve dependencies and build the project.

****Work Completed to Date

1) The design of the database tables.
2) The functionality to extract to extract and parse a DHL data file.
3) The functionality to input the DHL data into the database.

****Work that Needs to be Done

1) Create hibernate mapping for the connection to the database.
2) Create a method for extracting shipping data from the database.
3) Implement the ability to add shipping events to a database.
4) Implement the ability to extract shipping events from the database.

****Other Notes:

1) The SQL Create statements for the database are contained in the "sql queries" directory. 
2) A Excel sheet for testing the job is contained in "dhl data file" directory. The code for accessing this file has been hard coded in the DBInputOutput.java file. This will have to be changed when the developer is testing. 
3) The main for the job is in the file DBInputOutput.java.