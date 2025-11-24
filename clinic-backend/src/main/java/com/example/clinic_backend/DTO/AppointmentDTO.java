package com.example.clinic_backend.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentDTO {
    private Long id;
    private Long patientId;
    private String patientName;
    private String patientPhone;
    private Long doctorId;
    private String doctorName;
    private String specialization;
    private Long slotId;
    private LocalDate date;
    private LocalTime startTime;
    private String symptoms;
    private String status;
    private String bookedAt;
    private PrescriptionDTO prescription;

}
