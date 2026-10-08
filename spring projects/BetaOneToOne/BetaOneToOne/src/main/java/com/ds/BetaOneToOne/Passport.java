package com.ds.BetaOneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passport_id;
	
	private String passportIdNumber;

	public int getPassport_id() {
		return passport_id;
	}

	public void setPassport_id(int passport_id) {
		this.passport_id = passport_id;
	}

	public String getPassportIdNumber() {
		return passportIdNumber;
	}

	public void setPassportIdNumber(String passportIdNumber) {
		this.passportIdNumber = passportIdNumber;
	}
	
	
}
