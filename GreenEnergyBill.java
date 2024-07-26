import java.time.LocalTime;

public class GreenEnergyBill extends EnergyBill {
    private final double solarContribution;
    private final double windContribution;
    private final double hydroContribution;

    public GreenEnergyBill(String customerName, String address, double electricityUsage, double gasUsage, double solarContribution, double windContribution, double hydroContribution) {
        super(customerName, address, electricityUsage, gasUsage);
        this.solarContribution = solarContribution;
        this.windContribution = windContribution;
        this.hydroContribution = hydroContribution;
    }

    @Override
    public double calculateElectricityCharges() {
        double netElectricityUsage = getElectricityUsage() - solarContribution - windContribution - hydroContribution;
        if (netElectricityUsage < 0) {
            netElectricityUsage = 0; // No negative usage
        }
        double rate = (LocalTime.now().isAfter(LocalTime.of(7, 0)) && LocalTime.now().isBefore(LocalTime.of(19, 0))) ? 0.15 : 0.10;
        return netElectricityUsage * rate;
    }

    @Override
    public double calculateTotalBill() {
        return calculateElectricityCharges() + calculateGasCharges();
    }

    public double getSolarContribution() {
        return solarContribution;
    }

    public double getWindContribution() {
        return windContribution;
    }

    public double getHydroContribution() {
        return hydroContribution;
    }
}
