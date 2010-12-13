package org.tapestry5.banquet.entities;

import java.util.Date;

import org.apache.tapestry5.beaneditor.Validate;

public class Delivery {

	
	
	public Delivery() {
	}

	public Date date;
	
	public String Address;
	
	public String City;
	
	public long ZipCode;

	public Date getDate() {
		return date;
	}

	@Validate("required")
	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return Address;
	}

	@Validate("required")
	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	@Validate("required")
	public void setCity(String city) {
		City = city;
	}

	public long getZipCode() {
		return ZipCode;
	}

	@Validate("required")
	public void setZipCode(long zipCode) {
		ZipCode = zipCode;
	}
	
	
}
