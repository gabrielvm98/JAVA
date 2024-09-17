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

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Conductor> getConductorList() {
        return conductorList;
    }

    public void setConductorList(List<Conductor> conductorList) {
        this.conductorList = conductorList;
    }
}
