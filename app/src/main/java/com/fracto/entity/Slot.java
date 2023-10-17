package com.fracto.entity;
import java.sql.Date;
import java.sql.Time;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "AppointmentSlots")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SlotID")
    private int slotID;

    @Column(name = "Date")
    private Date date;

    @Column(name = "StartTime")
    private Time startTime;

    @Column(name = "EndTime")
    private Time endTime;

//    @Column(name = "Booked")
//    private Boolean booked;


}
