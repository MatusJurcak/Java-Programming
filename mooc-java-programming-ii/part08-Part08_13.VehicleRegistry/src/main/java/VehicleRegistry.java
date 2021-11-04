
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap <LicensePlate, String> vehicleRegister;

    public VehicleRegistry() {
        this.vehicleRegister = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicleRegister.containsKey(licensePlate)) {
            return false;
        } else {
            this.vehicleRegister.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        if (this.vehicleRegister.containsKey(licensePlate)) {
            return this.vehicleRegister.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicleRegister.containsKey(licensePlate)) {
            this.vehicleRegister.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : vehicleRegister.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for(String owner : vehicleRegister.values()){
            if(owners.contains(owner)){
                continue;
            }
            owners.add(owner);
            System.out.println(owner);
        }
    }
}
