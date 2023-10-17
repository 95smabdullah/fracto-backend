package com.fracto.entity;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
@Table(name = "Appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AppointmentID")
    private int appointmentID;

    @ManyToOne
    @JoinColumn(name = "DoctorID")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "SlotID")
    private Slot slot;
    
    // Constructors, getters, and setters
}

