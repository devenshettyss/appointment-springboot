package com.tcs.appointment.appointment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/placeAppointment")
	private void placeAppointment(@RequestBody Appointment appointment) {
		appointmentService.save(appointment);
	}
	
	@GetMapping("/appointments/{id}")
	public Appointment getUser(@PathVariable Integer id){
		Optional<Appointment> app = appointmentService.getAppointmentById(id);
		if(app.isPresent()) {
			Appointment dummy = app.get();
			System.out.println(dummy.getUser_name());
			return dummy;
			
		}
		else {
			System.out.println("No id found");
			
		}
		return null;
	}
	}
	


