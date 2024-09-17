public class Conductor {
    private Long conductorId;
    private String name;
    private String licence;
    private Vehicle vehicle;

    public Conductor() {

    }

    public Conductor(Long conductorId, String name, String licence) {
        this.conductorId = conductorId;
        this.name = name;
        this.licence = licence;
    }

    public Conductor(Long conductorId, String name, String licence, Vehicle vehicle) {
        this.conductorId = conductorId;
        this.name = name;
        this.licence = licence;
        this.vehicle = vehicle;
    }

    public Long getConductorId() {
        return conductorId;
    }

    public void setConductorId(Long conductorId) {
        this.conductorId = conductorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
