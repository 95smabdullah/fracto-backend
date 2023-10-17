package com.fracto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fracto.entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{

}
