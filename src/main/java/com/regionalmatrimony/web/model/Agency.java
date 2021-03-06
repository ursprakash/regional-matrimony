package com.regionalmatrimony.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AGENCY")
public class Agency {

	@Id
	@Column(name="AGENCYID")
	private String agencyId;
	@Column(name="AGENCYFULLNAME")
	private String agencyFullName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="CONTACTPERSON")
	private String contactPerson;
	@Column(name="MOBILENUMBER")
	private String mobileNumber;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="ISACTIVE")
	private boolean isActive;

	public String getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}
	public String getAgencyFullName() {
		return agencyFullName;
	}
	public void setAgencyFullName(String agencyFullName) {
		this.agencyFullName = agencyFullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Agency [agencyId=" + agencyId + ", agencyFullName=" + agencyFullName + ", email=" + email
				+ ", contactPerson=" + contactPerson + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", password=" + password + ", isActive=" + isActive + "]";
	}
}
