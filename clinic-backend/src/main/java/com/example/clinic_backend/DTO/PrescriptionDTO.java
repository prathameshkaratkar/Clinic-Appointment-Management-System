package com.example.clinic_backend.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrescriptionDTO {
    private Long id;
    private Long appointmentId;
    private String diagnosis;
    private String medicines;
    private String instructions;
    private String followUpNotes;
    private String prescribedAt;
}
