public class Main {
    public static void main(String[] args) {
        // Customer
        Customer customer = new Customer("C001", "Sutha Ratana", "123 Main St", "559-1234");

        // Salesperson
        Salesperson salesperson = new Salesperson("S001", "John Smith", "556-5678");

        // Trade-in vehicle
        TradeInVehicle tradeIn = new TradeInVehicle("T001", "Old Sedan", "Toyota Corolla", 2010);

        // Options
        Option option1 = new Option("O001", "Air Conditioning", 1200.00);
        Option option2 = new Option("O002", "Sunroof", 830.00);

        // New vehicle
        NewVehicle newVehicle = new NewVehicle("V001", "Holiday Van", "H2025", 2025, "Holiday Motors", 25000.00);

        // Subclasses
        RecreationalVehicle rv = new RecreationalVehicle("RV001", "Family Camper", "RV-X", 2025, "Holiday Motors", 40000.00);
        TravelTrailer trailer = new TravelTrailer("TT001", "Mini Trailer", "TT-Mini", 2025, "Holiday Motors", 15000.00);

        // Invoice
        Invoice invoice = new Invoice("INV001", "2025-09-16", 2000.00, 27000.00, 1500.00, 500.00,
                                      customer, salesperson, tradeIn, newVehicle);
        invoice.addOption(option1);
        invoice.addOption(option2);

        // Print everything
        System.out.println("Customer");
        System.out.println(customer);
        System.out.println("Salesperson");
        System.out.println(salesperson);
        System.out.println("Trade in venicle");
        System.out.println(tradeIn);
        System.out.println("Option");
        System.out.println(option1);
        System.out.println(option2);
        System.out.println("New vehicle");
        System.out.println(newVehicle);
         System.out.println("Subclasses");
        System.out.println(rv);
        System.out.println(trailer);
        System.out.println("Invoice");
        System.out.println(invoice);
    }
}
