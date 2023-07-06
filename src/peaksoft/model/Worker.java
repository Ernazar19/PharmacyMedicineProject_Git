package peaksoft.model;

import peaksoft.enums.Gender;

import java.time.LocalDate;

public class Worker {
    private Long id;
    private String workerName;
    private LocalDate dateOfBirth;
    private String email;
    private Gender gender;

    public Worker(Long id, String workerName, LocalDate dateOfBirth, String email, Gender gender) {
        this.id = id;
        this.workerName = workerName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Worker: " +
                "id: " + id +
                "workerName: " + workerName + "\n" +
                "dateOfBirth: " + dateOfBirth + "\n" +
                "email: " + email + "\n" +
                "gender: " + gender;
    }
}
