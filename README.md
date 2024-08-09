# Auto_Registry_Solution_Project_in_Core_Java
 Developed an auto registry solution to streamline the registration and management of vehicles.  Utilized core Java to ensure a robust and scalable application.
# Vehicle Registration System

## Overview

This project implements a simple vehicle registration system using Java. It allows users to register a vehicle, view its details, and update those details. The system interacts with the user through the console.

## Features

- **Register Vehicle**: Allows users to input details such as registration ID, owner name, model, price, color, Aadhaar number, mobile number, and city.
- **View Vehicle Details**: Displays the details of the registered vehicle.
- **Update Vehicle Details**: Enables updating specific details of the vehicle based on user input.

## Code Structure

### 1. `Vehicle` Class

The `Vehicle` class represents a vehicle with attributes:
- `regId` (int): Registration ID
- `price` (int): Price of the vehicle
- `ownername` (String): Owner's name
- `modelno` (String): Model number
- `colour` (String): Color of the vehicle
- `city` (String): City of registration
- `adhaarno` (long): Aadhaar number of the owner
- `mobno` (long): Mobile number of the owner

### 2. `Rto` Class

The `Rto` class handles the operations for:
- Registering a vehicle (`regVehicle` method)
- Viewing vehicle details (`viewDetails` method)
- Updating vehicle details (`updateVehicle` method)

### 3. `Test` Class

The `Test` class contains the `main` method to run the application. It presents a menu to the user for various operations:
- Register a vehicle
- View vehicle details
- Update vehicle details
- Exit the application

## How to Run

1. Ensure you have Java Development Kit (JDK) installed.
2. Clone this repository to your local machine using:
   ```sh
   git clone https://github.com/your-username/vehicle-registration-system.git


Navigate to the project directory:
sh
Copy code
cd vehicle-registration-system
Compile the Java files:
sh
Copy code
javac Vehicle.java Rto.java Test.java
Run the application:
sh
Copy code
java Test
Example
mathematica
Copy code
+++++++++PM AUTOREGISTRY +++++++++
1]Registration
2]View Details
3]Update Details
4]Exit
Enter your choice:
The user interacts with the application by selecting options from the menu and providing necessary details as prompted.

Contributing
Feel free to submit pull requests or open issues if you encounter any bugs or have suggestions for improvements.
