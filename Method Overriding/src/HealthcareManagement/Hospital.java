package HealthcareManagement;

class HospitalStaff {
    void duty() {
        System.out.println("Hospital staff performs general duties.");
    }
}

class Doctor extends HospitalStaff {
    @Override
    void duty() {
        System.out.println("Doctor diagnoses and treats patients.");
    }
}

class Nurse extends HospitalStaff {
    @Override
    void duty() {
        System.out.println("Nurse provides patient care and assistance.");
    }
}

public class Hospital {
    public static void main(String[] args) {

        HospitalStaff hs;

        hs = new Doctor();
        hs.duty();

        hs = new Nurse();
        hs.duty();
    }
}
