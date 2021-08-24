package com.tcs.appointment.appointment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointment_id;
	private String user_name;
	private long user_mobno;
	private String user_email;
	private String trainerpreference;
	private Integer noofweeks;
	private Integer pacakageselected;
	private boolean physiorequired;
	public Integer getAppointment_id() {
		return appointment_id;
	}
	public void setAppointment_id(Integer appointment_id) {
		this.appointment_id = appointment_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public long getUser_mobno() {
		return user_mobno;
	}
	public void setUser_mobno(long user_mobno) {
		this.user_mobno = user_mobno;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getTrainerpreference() {
		return trainerpreference;
	}
	public void setTrainerpreference(String trainerpreference) {
		this.trainerpreference = trainerpreference;
	}
	public Integer getNoofweeks() {
		return noofweeks;
	}
	public void setNoofweeks(Integer noofweeks) {
		this.noofweeks = noofweeks;
	}
	public Integer getPacakageselected() {
		return pacakageselected;
	}
	public void setPacakageselected(Integer pacakageselected) {
		this.pacakageselected = pacakageselected;
	}
	public boolean isPhysiorequired() {
		return physiorequired;
	}
	public void setPhysiorequired(boolean physiorequired) {
		this.physiorequired = physiorequired;
	}
	
	
}