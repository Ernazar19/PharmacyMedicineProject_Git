package peaksoft.db;

import peaksoft.model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Pharmacy>pharmacies = new ArrayList<>();
    public Database(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }
    public Database() {
    }
    public List<Pharmacy> getPharmacies() {
        return pharmacies;
    }
    public void setPharmacies(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }
}
