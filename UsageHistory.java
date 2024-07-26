import java.util.ArrayList;
import java.util.List;

public class UsageHistory {
    private final List<EnergyBill> billHistory;

    public UsageHistory() {
        this.billHistory = new ArrayList<>();
    }

    public void addBill(EnergyBill bill) {
        billHistory.add(bill);
    }

    public List<EnergyBill> getBillHistory() {
        return billHistory;
    }
}
