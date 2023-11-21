package com.demo.model;

import java.util.Date;

public class Appointment {
	
	int appointmentId;
	String patientName;
	int age;
	float weight;
	float height;
	String bloodGroup;
	String contactNo;
	String address;
	String doctorName;
	Date appointmentDate;
	String appointmentTime;
	String problemDescription;
	String medicalHistory;
	
	
	public Appointment(int appointmentId, String patientName, int age, float weight, float height, String bloodGroup,
			String contactNo, String address, String doctorName, Date appointmentDate, String appointmentTime,
			String problemDescription, String medicalHistory) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.bloodGroup = bloodGroup;
		this.contactNo = contactNo;
		this.address = address;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.problemDescription = problemDescription;
		this.medicalHistory = medicalHistory;
	}


	public int getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public Date getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	public String getAppointmentTime() {
		return appointmentTime;
	}


	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}


	public String getProblemDescription() {
		return problemDescription;
	}


	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}


	public String getMedicalHistory() {
		return medicalHistory;
	}


	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	


}
