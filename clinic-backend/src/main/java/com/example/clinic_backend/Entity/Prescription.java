package com.example.clinic_backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "prescriptions")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "appointment_id",nullable = false)
    private Appointment appointment;

    @Column(length = 2000, nullable = false)
    private String diagnosis;

    @Column(length = 3000, nullable = false)
    private String medicines;

    @Column(length = 1000)
    private String instructions;

    @Column(length = 500)
    private String followUpNotes;

    @Column(nullable = false, updatable = false)
    private LocalDateTime prescribedAt;

    @PrePersist
    protected void onCreate() {
        prescribedAt = LocalDateTime.now();
    }
}
