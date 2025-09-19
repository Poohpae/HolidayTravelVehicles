public class NewVehicle {
    private String vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacture;
    private double baseCost;

    public NewVehicle(String vehicleSerialNumber, String name, String model, int year, String manufacture, double baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacture = manufacture;
        this.baseCost = baseCost;
    }

    public String getVehicleSerialNumber() {
        return vehicleSerialNumber;
    }

    public void setVehicleSerialNumber(String vehicleSerialNumber) {
        this.vehicleSerialNumber = vehicleSerialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public String toString() {
        return "NewVehicle [serial=" + vehicleSerialNumber + ", name=" + name +
                ", model=" + model + ", year=" + year +
                ", manufacture=" + manufacture + ", baseCost=" + baseCost + "]";
    }
}