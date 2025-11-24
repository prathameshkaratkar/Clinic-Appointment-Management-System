package com.example.clinic_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatientId(Long patientId);

    @Query("SELECT a FROM Appointment a WHERE a.doctor.id = : doctorId AND a.scheduleSlot.date = : date")
    List<Appointment> findByDoctorIdAndDate(Long doctorId, LocalDate date);
}
