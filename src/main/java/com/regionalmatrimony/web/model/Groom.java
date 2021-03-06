package com.regionalmatrimony.web.model;

import java.io.File;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "GROOM")
@DynamicUpdate
public class Groom {

	@Id
	@Column(name = "MEMBERID")
	private String memberId;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "DATEOFBIRTH")
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date dateOfBirth;
	@Column(name = "AGE")
	private int age;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "EDUCATION")
	private String education;
	@Column(name = "OCCUPATION")
	private String occupation;
	@Column(name = "ANNUALINCOME")
	private String annualIncome;
	@Column(name = "WORKLOCATION")
	private String workLocation;
	@Column(name = "HEIGHT")
	private String height;
	@Column(name = "WEIGHT")
	private String weight;
	@Column(name = "FATHERSNAME")
	private String fathersName;
	@Column(name = "FATHERSOCCUPATION")
	private String fathersOccupation;
	@Column(name = "MOTHERSNAME")
	private String mothersName;
	@Column(name = "MOTHERSOCCUPATION")
	private String mothersOccupation;
	@Column(name = "MARITALSTATUS")
	private String maritalStatus;
	@Column(name = "DISABILITY")
	private String disability;
	@Column(name = "SIBLINGS")
	private String siblings;
	@Column(name = "CASTE")
	private String caste;
	@Column(name = "SUBCASTE")
	private String subCaste;
	@Column(name = "DIVISION")
	private String division;
	@Column(name = "DIETY")
	private String diety;
	@Column(name = "MOBILENUMBER")
	private String mobileNumber;
	@Column(name = "ALTERNATEMOBILENUMBER")
	private String alternateMobileNumber;
	@Column(name = "WHATSAPPNUMBER")
	private String whatsappNumber;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "STAR")
	private String star;
	@Column(name = "RAASI")
	private String raasi;
	@Column(name = "TIMEOFBIRTH")
	private String timeOfBirth;
	@Column(name = "PLACEOFBIRTH")
	private String placeOfBirth;
	@Column(name = "HOROSCOPE")
	private File horoscope;
	@Column(name = "AGENCYID")
	private String agencyId;
	@Column(name = "PASSWORD")
	private String password;
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mpId")
	private MatchPreference matchPreference;*/
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ORDER", joinColumns = @JoinColumn(name = "orderid"), inverseJoinColumns = @JoinColumn(name = "memberid"))
	private List<Order> order = new ArrayList<>();*/
	@Column(name = "CREATIONDATE")
	private Date creationDate;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
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

	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public MatchPreference getMatchPreference() {
		return matchPreference;
	}

	public void setMatchPreference(MatchPreference matchPreference) {
		this.matchPreference = matchPreference;
	}*/

	/*public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}*/

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
