package peaksoft.service.impl;

import peaksoft.model.Medicine;
import peaksoft.model.Pharmacy;
import peaksoft.model.Worker;
import peaksoft.service.Service;

import java.util.List;

public class ServiceImpl implements Service {
    @Override
    public List<Medicine> getAllMedicinesByPharmacy(String pharmacyName) {
        return null;
    }

    @Override
    public String addMedicinesToPharmacy(Long pharmacyId, Medicine medicine) {
        return null;
    }

    @Override
    public String addWorkerToPharmacy(Long pharmacyId, Worker worker) {
        return null;
    }

    @Override
    public String updateMedicinePrice(Long pharmacyId, Long medicineId, int price) {
        return null;
    }

    @Override
    public String deleteMedicineByName(Long pharmacyId, String medicineName) {
        return null;
    }

    @Override
    public String deleteWorkerByName(Long pharmacyId, String workerName) {
        return null;
    }

    @Override
    public Pharmacy getPharmacyByWorkerName(String workerName) {
        return null;
    }
}
