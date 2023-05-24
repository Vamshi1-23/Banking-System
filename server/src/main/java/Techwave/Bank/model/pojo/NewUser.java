package Techwave.Bank.model.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "B_Newuser")
@NamedQueries({
	@NamedQuery(name="NewUser.maximumUserId",
				query = "select max(b.userId) from NewUser b")
})
public class NewUser {
	@Id
	@Column(length = 30)
	private int userId;

	@Column(length = 20)
	private String fName;

	@Column(length = 20)
	private String lName;

	@Column(length = 30)
	private String email;

	@Column(length = 20)
	private String gender;

	@Column(length = 20)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;

	@Column(length = 20)
	private String phNo;

	@Column(length = 20)
	private String nationality;

	@Column(length = 40)
	private String aadhar;

	@Column(length = 50)
	private String address;

	@Column(length=20)
	private String ifsc;
	
	@Column(length=20)
	private String status;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public NewUser(int userId, String fName, String lName, String email, String gender, LocalDate dob, String phNo,
			String nationality, String aadhar, String address, String ifsc, String status) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.phNo = phNo;
		this.nationality = nationality;
		this.aadhar = aadhar;
		this.address = address;
		this.ifsc = ifsc;
		this.status = status;
	}

	public NewUser() {
		super();
	}

}