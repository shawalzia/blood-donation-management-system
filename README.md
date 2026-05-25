# Blood Donation Management System

A professional **JavaFX** desktop application designed to streamline blood bank operations. This project focuses on managing donor records, tracking blood bag inventory, and processing recipient requests with full data persistence.

##  Tech Stack
* **Language:** Java 21
* **Framework:** JavaFX (GUI)
* **Build Tool:** Maven
* **Storage:** Object Serialization (`.dat` files)

##  Key Features
* **Admin Control:** Secure login to manage the entire system.
* **Donor Management:** Comprehensive database to add and track donors.
* **Inventory System:** Real-time tracking of blood groups (A+, B-, O+, etc.).
* **Request Handling:** Automated matching of blood bags with recipient needs.
* **Exception Handling:** Custom alerts for "Out of Stock" or "Invalid Data" entries.

##  How to Run
1. Ensure you have **JDK 21** and **Maven** installed.
2. Clone this repository.
3. Open terminal in the project folder and run:
   ```bash
   mvn javafx:run
