public class Option {
    private String optionCode;
    private  String description;
    private double price;

    public Option(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
    public String getoptionCode(){
        return optionCode;
    }
    public void setoptionCode(String optionCode) {
        this.optionCode = optionCode;
    }
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }
    public double getprice() {
        return price;
    } 
    public void setprice(double price) {
        this.price = price;
    }
    
    // Method
    public void addNew() {
        System.out.println("New option added.");
    }
    public void delete() {
        System.out.println("Option deleted.");
    }
    public void modify() {
        System.out.println("OPtion modified.");
    }
    @Override
    public String toString() {
        return "Option [code=" + optionCode + ", desc=" + description + ", price=" + price + "]";
    }
    }
