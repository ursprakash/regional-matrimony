package com.regionalmatrimony.web.model;

import java.io.File;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="BRIDE")
public class Bride {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="memberid")
	private Long memberId;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="dateofbirth")
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date dateOfBirth;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="education")
	private String education;
	@Column(name="occupation")
	private String occupation;
	@Column(name="annualincome")
	private String annualIncome;
	@Column(name="worklocation")
	private String workLocation;
	@Column(name="height")
	private String height;
	@Column(name="weight")
	private String weight;
	@Column(name="fathersname")
	private String fathersName;
	@Column(name="fathersoccupation")
	private String fathersOccupation;
	@Column(name="mothersname")
	private String mothersName;
	@Column(name="mothersoccupation")
	private String mothersOccupation;
	@Column(name="maritalstatus")
	private String maritalStatus;
	@Column(name="disability")
	private String disability;
	@Column(name="siblings")
	private String siblings;
	@Column(name="caste")
	private String caste;
	@Column(name="subcaste")
	private String subCaste;
	@Column(name="division")
	private String division;
	@Column(name="diety")
	private String diety;
	@Column(name="mobilenumber")
	private String mobileNumber;
	@Column(name="alternatemobilenumber")
	private String alternateMobileNumber;
	@Column(name="whatsappnumber")
	private String whatsappNumber;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="star")
	private String star;
	@Column(name="raasi")
	private String raasi;
	@Column(name="timeofbirth")
	private String timeOfBirth;
	@Column(name="placeofbirth")
	private String placeOfBirth;
	@Column(name="horoscope")
	private File horoscope;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDisability() {
		return disability;
	}
	public void setDisability(String disability) {
		this.disability = disability;
	}
	public String getSiblings() {
		return siblings;
	}
	public void setSiblings(String siblings) {
		this.siblings = siblings;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public String getWhatsappNumber() {
		return whatsappNumber;
	}
	public void setWhatsappNumber(String whatsappNumber) {
		this.whatsappNumber = whatsappNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public File getHoroscope() {
		return horoscope;
	}
	public void setHoroscope(File horoscope) {
		this.horoscope = horoscope;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getFathersOccupation() {
		return fathersOccupation;
	}
	public void setFathersOccupation(String fathersOccupation) {
		this.fathersOccupation = fathersOccupation;
	}
	public String getMothersOccupation() {
		return mothersOccupation;
	}
	public void setMothersOccupation(String mothersOccupation) {
		this.mothersOccupation = mothersOccupation;
	}
	public String getSubCaste() {
		return subCaste;
	}
	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDiety() {
		return diety;
	}
	public void setDiety(String diety) {
		this.diety = diety;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getRaasi() {
		return raasi;
	}
	public void setRaasi(String raasi) {
		this.raasi = raasi;
	}
	public String getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(String timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
}