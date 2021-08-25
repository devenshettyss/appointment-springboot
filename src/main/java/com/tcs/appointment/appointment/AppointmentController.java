package com.tcs.appointment.appointment;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;







@RestController
public class AppointmentController {
	@Autowired
	private AppointmentRepository appointmentRepository;

	@PostMapping("/placeAppointment")
	private void placeAppointment(@RequestBody Appointment appointment) {
		appointmentRepository.save(appointment);
	}

	@GetMapping("/getAllAppointments")
	private List<Appointment> getAllAppointments() {
		return (List<Appointment>) appointmentRepository.findAll();

	}

	@GetMapping("getAppointment/{id}")
	private Optional<Appointment> getAppointmentById(@PathVariable int id) {
		return appointmentRepository.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAppointment(@PathVariable("id") Integer id) {
		appointmentRepository.deleteById(id);
	}
	
	@PutMapping("/update")
	private void updateAppointment(@RequestBody Appointment appointment) {
		appointmentRepository.save(appointment);
		System.out.println(appointment.getUser_name());
	}
	
	@ExceptionHandler(value = {AppointmentNotFoundException.class,EmptyResultDataAccessException.class})
	public ResponseEntity<Appointment> exception(AppointmentNotFoundException AppointmentNotFoundException) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/valid")
	public void saveuser(@Valid @RequestBody Appointment appointment) {

		if (appointment.getUser_name() == null || appointment.getUser_name().length() <= 5) {
			throw new RuntimeException("Invalid Entry!!"); 
			
		}

		appointmentRepository.save(appointment);

	}


	}
	


