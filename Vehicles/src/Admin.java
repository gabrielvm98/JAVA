import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Vehicle> vehicleList;
    private List<Conductor> conductorList;

    public Admin() {
        this.vehicleList = new ArrayList<>();
        this.conductorList = new ArrayList<>();
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    public List<Conductor> getConductorList() {
        return conductorList;
    }

    public void addConductor(Conductor conductor) {
        this.conductorList.add(conductor);
    }
}
