package com.example.clinic_backend.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingAppointmentRequest {
    private Long slotId;
    private String symptoms;
}

