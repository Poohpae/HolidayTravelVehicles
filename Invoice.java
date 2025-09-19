import java.util.ArrayList;

public class Invoice {
    private String invoiceID;
    private String date;
    private double tradeInAllowance;
    private double finalPrice;
    private double tax;
    private double licenseFee;

    private Customer customer;
    private Salesperson salesperson;
    private TradeInVehicle tradeInVehicle;
    private NewVehicle newVehicle;
    private ArrayList<Option> options = new ArrayList<>();

    public Invoice(String invoiceID, String date, double tradeInAllowance, double finalPrice,
                   double tax, double licenseFee, Customer customer, Salesperson salesperson,
                   TradeInVehicle tradeInVehicle, NewVehicle newVehicle) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.tradeInAllowance = tradeInAllowance;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.customer = customer;
        this.salesperson = salesperson;
        this.tradeInVehicle = tradeInVehicle;
        this.newVehicle = newVehicle;
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public void addNew() {
        System.out.println("Invoice created.");
    }

    public void delete() {
        System.out.println("Invoice deleted.");
    }

    public void modify() {
        System.out.println("Invoice modified.");
    }

    @Override
    public String toString() {
        return "Invoice [ID=" + invoiceID + ", date=" + date +
                ", tradeInAllowance=" + tradeInAllowance +
                ", finalPrice=" + finalPrice + ", tax=" + tax +
                ", licenseFee=" + licenseFee + ", customer=" + customer +
                ", salesperson=" + salesperson +
                ", tradeInVehicle=" + tradeInVehicle +
                ", newVehicle=" + newVehicle +
                ", options=" + options + "]";
    }
}