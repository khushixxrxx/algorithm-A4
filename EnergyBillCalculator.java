import java.util.Scanner;

public class EnergyBillCalculator {

    public static void main(String[] args) {
        UsageHistory usageHistory = new UsageHistory();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter customer name:");
            String name = scanner.nextLine();
            System.out.println("Enter address:");
            String address = scanner.nextLine();
            System.out.println("Enter electricity usage (in kWh):");
            double electricityUsage = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter gas usage (in units):");
            double gasUsage = Double.parseDouble(scanner.nextLine());

            System.out.println("Does the customer use green energy? (yes/no):");
            String greenEnergy = scanner.nextLine();

            EnergyBill bill;

            if (greenEnergy.equalsIgnoreCase("yes")) {
                System.out.println("Enter solar energy contribution (in kWh):");
                double solarContribution = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter wind energy contribution (in kWh):");
                double windContribution = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter hydro energy contribution (in kWh):");
                double hydroContribution = Double.parseDouble(scanner.nextLine());

                bill = new GreenEnergyBill(name, address, electricityUsage, gasUsage, solarContribution, windContribution, hydroContribution);
            } else {
                bill = new EnergyBill(name, address, electricityUsage, gasUsage);
            }

            usageHistory.addBill(bill);

            System.out.println("Energy Bill for " + (bill instanceof GreenEnergyBill ? "Green Energy Customer" : "Standard Customer") + ":");
            System.out.println("Customer Name: " + bill.getCustomerName());
            System.out.println("Address: " + bill.getAddress());
            System.out.println("Electricity Usage (kWh): " + bill.getElectricityUsage());
            System.out.println("Gas Usage (units): " + bill.getGasUsage());
            if (bill instanceof GreenEnergyBill greenBill) {
                System.out.println("Solar Contribution (kWh): " + greenBill.getSolarContribution());
                System.out.println("Wind Contribution (kWh): " + greenBill.getWindContribution());
                System.out.println("Hydro Contribution (kWh): " + greenBill.getHydroContribution());
            }
            System.out.println("Total Bill: $" + bill.calculateTotalBill());
        } catch (NumberFormatException ex) {
            System.out.println("Please enter valid numeric values for usage and contributions.");
        }
    }
}
