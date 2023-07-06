package peaksoft.model;
import java.util.List;
public class Pharmacy {
    private Long id;
    private String pharmacyName;
    private String address;
    private List<Medicine> medicines;
    private List<Worker> workers;

    public Pharmacy(Long id, String pharmacyName, String address, List<Medicine> medicines, List<Worker> workers) {
        this.id = id;
        this.pharmacyName = pharmacyName;
        this.address = address;
        this.medicines = medicines;
        this.workers = workers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Pharmacy: " +
                "id: " + id +"\n"+
                "pharmacyName: " + pharmacyName+ "\n"+
                "address: " + address + "\n"+
                "medicines: " + medicines +"\n"+
                "workers: " + workers;
    }
}
