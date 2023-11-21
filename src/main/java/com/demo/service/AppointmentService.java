package com.demo.service;

public interface AppointmentService {
	
	public String generateReport();
        public boolean addAppointment(Appointment appointment);
        public boolean deleteAppointment(int appointmentId);
        public Appointment getAppointment(int appointmentId);
        public Appointment updateAppointment(Appointment appointment);
        public List<Appointment> getAllAppointments();
	

}
