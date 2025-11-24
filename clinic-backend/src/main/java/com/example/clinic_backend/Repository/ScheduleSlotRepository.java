package com.example.clinic_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface ScheduleSlotRepository extends JpaRepository<ScheduleSlot, Long> {
    List<scheduleSlot> findByDoctorIdAndDate(Long doctorId, LocalDate date);
    List<ScheduleSlot> findByDoctorIdAndDateAndStatus(Long doctorId, LocalDate date, ScheduleSlot.SlotStatus);
}
