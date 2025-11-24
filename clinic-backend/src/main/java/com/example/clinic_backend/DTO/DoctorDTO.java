package com.example.clinic_backend.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorDTO {
    private Long id;
    private Long userId;
    private String email;
    private String fullName;
    private String phone;
    private String specialization;
    private String qualification;
    private Integer experience;
    private Double consultationFee;
    private String bio;
    private String password;

}
