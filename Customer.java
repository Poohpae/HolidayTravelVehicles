public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phone;
    public Customer(String customerID, String name, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public String getCustomerID() {
        return customerID;
    }
     public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getaddress() {
        return address;
    }
    public void setaddress(String address) {
        this.address = address;
    }
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }

    // method
    public void addNew() {
        System.out.println("Customer added.");
    }
    public void modify() {
        System.err.println("Customer modified");
    }
    public void delete() {
        System.err.println("Customer deleted");
    }

    @Override
    public String toString() {
        return "Customer [ID " + customerID + ", name=" + name + 
        ", address=" + address + ", phone=" + phone + "]";
    }
}