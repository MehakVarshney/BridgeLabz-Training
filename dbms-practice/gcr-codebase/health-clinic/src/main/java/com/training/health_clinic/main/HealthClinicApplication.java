package com.training.health_clinic.main;

import com.training.health_clinic.patient.RegisterPatient;
import com.training.health_clinic.doctor.AddDoctor;
import com.training.health_clinic.appointment.BookAppointment;
import com.training.health_clinic.visit.RecordVisit;
import com.training.health_clinic.billing.GenerateBill;

public class HealthClinicApplication {

    public static void main(String[] args) {

        System.out.println("=== Health Clinic Management System ===");

        try {
            RegisterPatient.execute();
            AddDoctor.execute();
            BookAppointment.execute();
            RecordVisit.execute();
            GenerateBill.execute();

            System.out.println("=== Application Executed Successfully ===");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

