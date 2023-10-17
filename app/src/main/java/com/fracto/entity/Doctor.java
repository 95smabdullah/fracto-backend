package com.fracto.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DoctorID")
    private int doctorID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Specialty")
    private String specialty;
    
    @OneToOne
    @JoinColumn(name="SlotID")
    private Slot slot;

}
