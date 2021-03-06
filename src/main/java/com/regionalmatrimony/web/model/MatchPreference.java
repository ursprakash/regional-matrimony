package com.regionalmatrimony.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "MATCHPREFERENCE")
@DynamicUpdate
public class MatchPreference {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mpId;
	@Column(name = "STARTAGE")
	private int startAge;
	@Column(name = "ENDAGE")
	private int endAge;
	@Column(name = "EDUCATION")
	private String education;
	@Column(name = "OCCUPATION")
	private String occupation;
	@Column(name = "WORKLOCATION")
	private String workLocation;
	@Column(name = "HEIGHT")
	private String height;
	@Column(name = "WEIGHT")
	private String weight;
	@Column(name = "MARITALSTATUS")
	private String maritalStatus;
	@Column(name = "DISABILITY")
	private String disability;
	@Column(name = "CASTE")
	private String caste;
	@Column(name = "SUBCASTE")
	private String subCaste;
	@Column(name = "DIVISION")
	private String division;
	@Column(name = "DIETY")
	private String diety;
	@Column(name = "STAR")
	private String star;
	@Column(name = "RAASI")
	private String raasi;
	@Column(name = "MEMBERID")
	private String memberId;
	public int getMpId() {
		return mpId;
	}
	public void setMpId(int mpId) {
		this.mpId = mpId;
	}
	public int getStartAge() {
		return startAge;
	}
	public void setStartAge(int startAge) {
		this.startAge = startAge;
	}
	public int getEndAge() {
		return endAge;
	}
	public void setEndAge(int endAge) {
		this.endAge = endAge;
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
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override	
	public String toString() {
		return "MatchPreference [mpId=" + mpId + ", startAge=" + startAge + ", endAge=" + endAge + ", education="
				+ education + ", occupation=" + occupation + ", workLocation=" + workLocation + ", height=" + height
				+ ", weight=" + weight + ", maritalStatus=" + maritalStatus + ", disability=" + disability + ", caste="
				+ caste + ", subCaste=" + subCaste + ", division=" + division + ", diety=" + diety + ", star=" + star
				+ ", raasi=" + raasi + "]";
	}
}
