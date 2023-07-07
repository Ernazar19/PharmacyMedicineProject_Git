package peaksoft.service.impl;

import peaksoft.db.Database;
import peaksoft.exceptions.NotFoundExcep;
import peaksoft.model.Medicine;
import peaksoft.model.Pharmacy;
import peaksoft.model.Worker;
import peaksoft.service.Service;

import java.time.LocalDate;
import java.util.List;

public class ServiceImpl implements Service {
    private Database database;

    public ServiceImpl(Database database) {
        this.database = database;
    }
    @Override
    public List<Medicine> getAllMedicinesByPharmacy(String pharmacyName) {
        return null;
    }

    @Override
    public String addMedicinesToPharmacy(Long pharmacyId, Medicine medicine) {
        boolean isTrue = true;
        try {
            for (int i = 0; i < database.getPharmacies().size(); i++) {
                if (database.getPharmacies().get(i).getId().equals(pharmacyId)){
                    isTrue = true;
                    database.getPharmacies().get(i).getMedicines().add(medicine);
                    return String.format("Medicine with name: %s " +
                            "successfully added to Pharmacy with id: %s",medicine.getMedicineName(),pharmacyId);
                }else {
                    isTrue = false;
                }
            }if (!isTrue){
                throw new NotFoundExcep(String.format("Pharmacy with id: %s is not found",pharmacyId));
            }
        }catch (NotFoundExcep n){
            System.out.println(n.getMessage());
        }
        return null;
    }

    @Override
    public String addWorkerToPharmacy(Long pharmacyId, Worker worker) {
        boolean isTrue = true;
        try {
            for (int i = 0; i < database.getPharmacies().size(); i++) {
                if (database.getPharmacies().get(i).getId().equals(pharmacyId)){
                    isTrue = false;
                    for (Worker a:database.getPharmacies().get(i).getWorkers()) {
                        if (a.getEmail().equalsIgnoreCase(worker.getEmail())) {
                            isTrue = true;
                            throw new NotFoundExcep(String.format("Worker with email:%s already exists", worker.getEmail()));
                        }else {
                            a.setEmail(worker.getEmail());
                        }
                        int now = LocalDate.now().getYear();
                        int dateOfBirth = a.getDateOfBirth().getYear();
                        int age = now - dateOfBirth;
                        if (age < 18) {
                            a.setDateOfBirth(worker.getDateOfBirth());
                        }else {
                            throw new NotFoundExcep("The age employee is reported to be more than 18!");
                        }
                        database.getPharmacies().get(i).getWorkers().add(a);
                        }
                    }
                }
        }catch (NotFoundExcep e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String updateMedicinePrice(Long pharmacyId, Long medicineId, int price) {

        return null;
    }

    @Override
    public String deleteMedicineByName(Long pharmacyId, String medicineName) {
        boolean isTrue = true;
        try {
            for (int i = 0; i < database.getPharmacies().size(); i++) {
                if (database.getPharmacies().get(i).getId().equals(pharmacyId)){
                    isTrue = true;
                    for (int j = 0; j < i; j++) {
                        if (database.getPharmacies().get(i).getMedicines().get(j).getMedicineName().equalsIgnoreCase(medicineName)){
                            database.getPharmacies().get(i).getMedicines()
                                    .remove(database.getPharmacies().get(i).getMedicines().get(j));
                            return String.format("Medicine with name: %s successfully deleted",medicineName);
                        }
                    }
                }else {
                    isTrue = false;
                }
            }if (isTrue){
                throw new NotFoundExcep(String.format("Pharmacy with id: %s is not found",pharmacyId));
            }
        }catch (NotFoundExcep e){
            System.out.println(e.getMessage());
        }
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
