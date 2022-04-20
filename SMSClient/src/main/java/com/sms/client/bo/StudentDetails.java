package com.sms.client.bo;

public class StudentDetails {

	private String schoolName;
	private String schoolLocation;

	private Integer studentId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String mobileNumber;
	private String emailId;
	private String standard;
	private String address;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolLocation() {
		return schoolLocation;
	}

	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}

	@Override
	public String toString() {
		return "StudentDetails [schoolName=" + schoolName + ", schoolLocation=" + schoolLocation + ", studentId="
				+ studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", standard=" + standard
				+ ", address=" + address + "]";
	}

	
}

