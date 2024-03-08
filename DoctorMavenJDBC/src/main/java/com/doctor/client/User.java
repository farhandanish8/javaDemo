package com.doctor.client;

import com.doctor.model.Doctor;
import com.doctor.model.Specializaton;
import com.doctor.service.DoctorServiceImpl;
import com.doctor.service.IDoctorService;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();

        Specializaton specializaton = Specializaton.GYNAEC;
        String speciality = specializaton.getSpeciality();

        String special = Specializaton.GYNAEC.getSpeciality();
        Doctor doctor = new Doctor("Kavitha", speciality,1000,8,10);
        doctorService.addDoctor(doctor);
        Doctor doctor1 = new Doctor("Farhan",speciality,2000,10,5);
        doctorService.addDoctor(doctor1);
        Doctor doctor2 = new Doctor("Danish",speciality,3000,9,20);
        doctorService.addDoctor(doctor2);
        Doctor doctor3 = new Doctor("Prajwal", speciality,4000,10,15);
        doctorService.addDoctor(doctor3);
        Doctor doctor4 = new Doctor("Nikhil",speciality,5000,8,20);
        doctorService.addDoctor(doctor4);
    }
}
