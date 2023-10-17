package com.fracto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fracto.entity.Slot;

public interface AppointmentSlotRepo extends JpaRepository<Slot, Integer>{

}
