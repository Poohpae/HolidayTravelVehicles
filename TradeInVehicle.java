public class TradeInVehicle {
    private String vehicleSerialNumber;
    private  String name;
    private String model;
    private int year;

    public TradeInVehicle(String vehicleSerialNumber, String name, String model, int year) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public String getvehicleSerialNumber() {
        return vehicleSerialNumber;
    }
    public void setvehicleSerialNumber(String vehicleSerialNumber) {
        this.vehicleSerialNumber = vehicleSerialNumber;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel(String model) {
        this.model =model;
    }
    public int getyear() {
        return  year;
    }
    public void setyear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "TradeInVehicle [serial=" + vehicleSerialNumber + ", name" + name + ", model" + model +", year" + year + "]";
    }
}