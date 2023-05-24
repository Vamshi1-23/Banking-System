package Techwave.Bank.model.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "B_BranchManager")
public class BranchManager {

	@Id
	@Column(length = 20)
	private String mgrId;
	
	@Column(length = 20)
	private String fname;
	
	@Column(length = 20)
	private String lname;
	
	@Column(length = 20)
	private String address;
	
	@Column(length = 20)
	private String gender;
	
	@Column(length = 20)
	private LocalDate dob;
	
	@Column(length = 20)
	private LocalDate doj;
	
	@OneToOne
	@JoinColumn(name = "ifsc")
	private Branch ifsc;
	
	@OneToOne
	@JoinColumn(name="adminId")
	private Admin adminId;

	public String getMgrId() {
		return mgrId;
	}

	public void setMgrId(String mgrId) {
		this.mgrId = mgrId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	

	public Branch getIfsc() {
		return ifsc;
	}

	public void setIfsc(Branch ifsc) {
		this.ifsc = ifsc;
	}

	public Admin getAdminId() {
		return adminId;
	}

	public void setAdminId(Admin adminId) {
		this.adminId = adminId;
	}

	public BranchManager(String mgrId, String fname, String lname, String address, String gender, LocalDate dob,
			LocalDate doj, Branch branchId, Admin adminId) {
		super();
		this.mgrId = mgrId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.doj = doj;
		this.ifsc = branchId;
		this.adminId = adminId;
	}

	public BranchManager() {
		super();
	}
	
	
	
}
