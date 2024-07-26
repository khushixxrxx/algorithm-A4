import java.time.LocalDate;
import java.time.LocalTime;

public class EnergyBill{
    private final String customerName;
    private final String address;
    private final double electricityUsage; // in kWh
    private final double gasUsage; // in units
    private final LocalDate date;

    public EnergyBill(String customerName, String address, double electricityUsage, double gasUsage) {
        this.customerName = customerName;
        this.address = address;
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
        this.date = LocalDate.now();
    }

    public double calculateElectricityCharges() {
        LocalTime currentTime = LocalTime.now();
        double rate = (currentTime.isAfter(LocalTime.of(7, 0)) && currentTime.isBefore(LocalTime.of(19, 0))) ? 0.15 : 0.10;
        return electricityUsage * rate;
    }

    public double calculateGasCharges() {
        return gasUsage * 0.09;
    }

    public double calculateTotalBill() {
        return calculateElectricityCharges() + calculateGasCharges();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public double getElectricityUsage() {
        return electricityUsage;
    }

    public double getGasUsage() {
        return gasUsage;
    }

    public LocalDate getDate() {
        return date;
    }
}
