package peaksoft.service;

import peaksoft.model.Medicine;
import peaksoft.model.Pharmacy;
import peaksoft.model.Worker;

import java.util.List;

public interface Service {
    List<Medicine>getAllMedicinesByPharmacy(String pharmacyName);
    String addMedicinesToPharmacy(Long pharmacyId,Medicine medicine);
    String addWorkerToPharmacy(Long pharmacyId, Worker worker);
    String updateMedicinePrice(Long pharmacyId, Long medicineId, int price);
    String deleteMedicineByName(Long pharmacyId,String medicineName);
    String deleteWorkerByName(Long pharmacyId,String workerName);
    Pharmacy getPharmacyByWorkerName(String workerName);
}
