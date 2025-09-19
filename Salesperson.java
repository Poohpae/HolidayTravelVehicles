public class Salesperson {
    private String salepersonID;
    private String name;
    private String phone;

    public Salesperson(String salepersonID, String name, String phone) {
        this.salepersonID = salepersonID;
        this.name = name;
        this.phone = phone;
    }
    public String getsalepersonID() {
        return salepersonID;
    }
    public void setsalepersonID(String salepersonID) {
        this.salepersonID = salepersonID;
    }
    public String getname(){
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Salesperson [ID=" + salepersonID + ", name=" + name + ", phone= " + phone + "]";
    }
}