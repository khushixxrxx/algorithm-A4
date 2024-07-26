Household Energy Bill Calculator with Green Energy Options
Overview
This Java application calculates monthly energy bills for households, including provisions for customers using green energy sources. The project demonstrates the use of object-oriented programming principles such as inheritance, encapsulation, and polymorphism.

Features
Basic Energy Bill Calculation: Calculate charges based on electricity and gas usage.
Green Energy Bill Calculation: Adjust energy charges by accounting for contributions from solar, wind, and hydro energy.
Dynamic Rates: Apply different rates based on peak and off-peak hours for electricity usage.
Usage History: Maintain a history of past energy bills for analysis.
Comprehensive Input and Output: Prompt users for detailed energy usage input and display a clear breakdown of the total bill.
Classes and Methods
EnergyBill
The EnergyBill class represents a customer's energy bill with basic details and methods to calculate charges for electricity and gas usage.

Attributes: customerName, address, electricityUsage, gasUsage, date
Methods:
calculateElectricityCharges(): Calculates electricity charges based on usage and dynamic rates.
calculateGasCharges(): Calculates gas charges based on usage.
calculateTotalBill(): Calculates the total bill by summing electricity and gas charges.
Getters for all attributes.
GreenEnergyBill
The GreenEnergyBill class extends EnergyBill to include contributions from various green energy sources and overrides methods to calculate deductions for green energy usage.

Attributes: solarContribution, windContribution, hydroContribution
Methods:
calculateElectricityCharges(): Calculates electricity charges after deducting green energy contributions.
calculateTotalBill(): Calculates the total bill after including deductions for green energy contributions.
Getters for green energy contributions.
UsageHistory
The UsageHistory class maintains a history of energy bills for analysis and tracking.

Attributes: billHistory (List of EnergyBill objects)
Methods:
addBill(EnergyBill bill): Adds an energy bill to the bill history.
getBillHistory(): Retrieves the list of all energy bills in the history.
EnergyBillCalculator
The EnergyBillCalculator class contains the main method to run the program, prompting users for input, calculating energy bills, and displaying the results.

Main Method:
Prompts user for customer details and energy usage.
Checks if the customer uses green energy and collects additional contributions if applicable.
Creates an instance of EnergyBill or GreenEnergyBill based on the input.
Calculates and displays the total bill, showing deductions for green energy contributions if applicable.
Adds the bill to the usage history.
Sample Output
Scenario 1: Standard Customer
User Input:

mathematica
Copy code
Enter customer name: John Doe
Enter address: 123 Main Street
Enter electricity usage (in kWh): 350
Enter gas usage (in units): 150
Does the customer use green energy? (yes/no): no
Program Output:

yaml
Copy code
Energy Bill for Standard Customer:
Customer Name: John Doe
Address: 123 Main Street
Electricity Usage (kWh): 350.0
Gas Usage (units): 150.0
Total Bill: $63.0
Scenario 2: Green Energy Customer
User Input:

mathematica
Copy code
Enter customer name: Jane Smith
Enter address: 456 Elm Street
Enter electricity usage (in kWh): 300
Enter gas usage (in units): 100
Does the customer use green energy? (yes/no): yes
Enter solar energy contribution (in kWh): 50
Enter wind energy contribution (in kWh): 30
Enter hydro energy contribution (in kWh): 20
Program Output:

java
Copy code
Energy Bill for Green Energy Customer:
Customer Name: Jane Smith
Address: 456 Elm Street
Electricity Usage (kWh): 300.0
Gas Usage (units): 100.0
Solar Contribution (kWh): 50.0
Wind Contribution (kWh): 30.0
Hydro Contribution (kWh): 20.0
Total Bill: $39.0
How to Run
Set Up Java Environment:

Ensure you have Java Development Kit (JDK) installed on your machine.
Install the Java Extension Pack in Visual Studio Code.
Create Project Folder:

Create a new folder for your project and open it in Visual Studio Code.
Create Java Files:

Create EnergyBill.java, GreenEnergyBill.java, UsageHistory.java, and EnergyBillCalculator.java files in the project folder.
Copy the respective class definitions into these files.
Compile and Run:

Open the terminal in Visual Studio Code.
Navigate to the project directory.
Compile the Java files using javac *.java.
Run the program using java EnergyBillCalculator.
Contributing
