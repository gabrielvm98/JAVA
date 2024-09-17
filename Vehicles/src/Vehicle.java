public class Vehicle {
    private Long vehicleId;
    private String type;
    private String brand;
    private String state;
    private Boolean isAssigned;

    public Vehicle() {

    }

    public Vehicle(Long vehicleId, String type, String brand, String state, Boolean isAssigned) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.brand = brand;
        this.state = state;
        this.isAssigned = isAssigned;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getAssigned() {
        return isAssigned;
    }

    public void setAssigned(Boolean assigned) {
        isAssigned = assigned;
    }
}
