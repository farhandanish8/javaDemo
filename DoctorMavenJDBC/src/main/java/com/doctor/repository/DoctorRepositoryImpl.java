package com.doctor.repository;

import com.doctor.client.User;
import com.doctor.model.Doctor;
import com.doctor.util.DoctorDb;
import com.doctor.util.Queries;
import com.mysql.cj.exceptions.ConnectionIsClosedException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ) {
            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3, doctor.getExperience());
            statement.setInt(4, doctor.getRatings());
            statement.setDouble(5, doctor.getFees());

            boolean result = statement.execute();
            System.out.println("one row inserted " + !result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
        ) {
            statement.setInt(2, doctorId);
            statement.setDouble(1, fees);
            int result = statement.executeUpdate();
            System.out.println("one row updated" + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDoctor(int doctorId) {

    }

    @Override
    public Doctor findById(int doctorId) {
        return null;
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctorList = new ArrayList<>();
        try (
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
                ResultSet resultSet = statement.executeQuery(Queries.FINDALLQUERY);
        ) {
            while (resultSet.next()) {
                String doctorName = resultSet.getString("doctor_name");
                String speciality = resultSet.getString("speciality");
                int experience = resultSet.getInt("experience");
                int ratings = resultSet.getInt("ratings");
                int doctorId = resultSet.getInt("doctorId");
                double fees = resultSet.getDouble("fees");

                Doctor doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);
                doctorList.add(doctor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY)) {
            statement.setString(1, speciality);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    int ratings = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees = resultSet.getDouble("fees");
                    Doctor doctor = new Doctor();

                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setRatings(ratings);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, double ratings) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY);
        ) {
            statement.setString(1, speciality);
            statement.setString(2, "%" + doctorName + "%");
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));

                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }
}