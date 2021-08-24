package com.tcs.appointment.appointment;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

	 @Autowired
	 AppointmentRepository appointmentRepository;
	 
	 public void save(Appointment appointment) {
		 appointmentRepository.save(appointment);
			System.out.println("saved");
		}
	 

		public Optional<Appointment> getAppointmentById(Integer id) {
			Optional<Appointment> app = appointmentRepository.findById(id);
			return app;
			
		}
	 
}
