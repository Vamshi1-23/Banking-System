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
@Table(name = "B_Users")
@NamedQueries({
	@NamedQuery(name="User.maximumUserId",
				query = "select max(b.userId) from User b"),
	@NamedQuery(name="User.maximumpassword",
	query = "select max(b.password) from User b"),
})
public class User {
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

	@Column(length = 30)
	private String ifsc;
	
	@Column(length = 20)
	private int password;

	@OneToOne
	@JoinColumn(name = "accNo",referencedColumnName = "accNo")
	private Account accId;

	public User(int userId, String fName, String lName, String email, String gender, LocalDate dob, String phNo,
			String nationality,int password, String aadhar, String address, String ifsc, Account accId) {
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
		this.accId = accId;
		this.password=password;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int string) {
		this.userId = string;
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

	public Account getAccId() {
		return accId;
	}

	public void setAccId(Account accId) {
		this.accId = accId;
	}

}
