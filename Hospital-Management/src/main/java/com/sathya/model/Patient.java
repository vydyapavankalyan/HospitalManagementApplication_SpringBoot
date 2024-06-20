package com.sathya.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import java.sql.Date;

import jakarta.persistence.*;

// Patient.java
	@Entity
	public class Patient {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;

	    private String firstName;
	    private String lastName;
	    private int  age;
	    private String gender;
	    private String bloodType;
	    private String healthCardNumber;
	    private String email;
	    private Long phoneNumber;
	    private String address;
	    private String doctors;
	    private Date  joindate;
	     // constructors, getters, setters, toString 
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getBloodType() {
			return bloodType;
		}
		public void setBloodType(String bloodType) {
			this.bloodType = bloodType;
		}
		public String getHealthCardNumber() {
			return healthCardNumber;
		}
		public void setHealthCardNumber(String healthCardNumber) {
			this.healthCardNumber = healthCardNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDoctors() {
			return doctors;
		}
		public void setDoctors(String doctors) {
			this.doctors = doctors;
		}
		public Date getJoindate() {
			return joindate;
		}
		public void setJoindate(Date joindate) {
			this.joindate = joindate;
		}
		@Override
		public String toString() {
			return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", gender=" + gender + ", bloodType=" + bloodType + ", healthCardNumber=" + healthCardNumber
					+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", doctors="
					+ doctors + ", joindate=" + joindate + "]";
		}
		public Patient(Long id, String firstName, String lastName, int age, String gender, String bloodType,
				String healthCardNumber, String email, Long phoneNumber, String address, String doctors,
				Date joindate) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.gender = gender;
			this.bloodType = bloodType;
			this.healthCardNumber = healthCardNumber;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.doctors = doctors;
			this.joindate = joindate;
		}
		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	    
	}

	  
	



