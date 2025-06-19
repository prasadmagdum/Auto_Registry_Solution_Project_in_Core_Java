Auto Registry Readme
Auto Registry Solution Project in Core Java
Vehicle Registration System
Overview
The Auto Registry Solution is a console-based Java application designed to streamline the registration and management of vehicles. Built with Core Java, the system ensures a robust and scalable solution for vehicle registration.

Features
Register Vehicle – Input details such as registration ID, owner name, model, price, color, Aadhaar number, mobile number, and city.
View Vehicle Details – Display stored vehicle details.
Update Vehicle Details – Modify specific details of a registered vehicle.
User-Friendly Console Interface – Simple menu-driven interactions.

Code Structure
Vehicle Class
Represents a vehicle with the following attributes:

regId (int) – Registration ID

price (int) – Vehicle Price

ownername (String) – Owner’s Name

modelno (String) – Model Number

colour (String) – Vehicle Color

city (String) – Registration City

adhaarno (long) – Owner’s Aadhaar Number

mobno (long) – Owner’s Mobile Number

 Rto Class
Handles key operations:

regVehicle() – Register a new vehicle.

viewDetails() – Display details of a registered vehicle.

updateVehicle() – Update specific vehicle details.

 Test Class
Contains the main method, displaying a menu with the following options: 
1️Register a Vehicle
2️ View Vehicle Details
3️ Update Vehicle Details
4️ Exit

How to Run
Prerequisites
Ensure you have Java Development Kit (JDK) installed.

 Clone Repository
 git clone https://github.com/prasadmagdum/Auto_Registry_Solution_Project_in_Core_Java/edit/main
 Navigate to Project Directory
cd vehicle-registration-system
 Compile Java Files
javac Vehicle.java Rto.java Test.java
Run the Application
java Test
Example Console Interaction
+++++++++ PM AUTOREGISTRY +++++++++
1] Registration
2] View Details
3] Update Details
4] Exit
Enter your choice:
The user interacts by selecting options and providing required details as prompted.

![image alt](https://github.com/prasadmagdum/Auto_Registry_Solution_Project_in_Core_Java/blob/40f29a41ae7a976ee0e0c8a0582415a50b703b0e/Screenshot%202025-06-19%20195509.png)
![image alt](https://github.com/prasadmagdum/Auto_Registry_Solution_Project_in_Core_Java/blob/40f29a41ae7a976ee0e0c8a0582415a50b703b0e/Screenshot%202025-06-19%20195704.png)
![image alt](https://github.com/prasadmagdum/Auto_Registry_Solution_Project_in_Core_Java/blob/40f29a41ae7a976ee0e0c8a0582415a50b703b0e/Screenshot%202025-06-19%20195727.png)

