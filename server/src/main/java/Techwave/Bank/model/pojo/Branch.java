package Techwave.Bank.model.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="B_Branch")
public class Branch {
	
	@Id
	@Column(length = 20)
	private String ifsc;
	
	@Column(length = 20)
	private String bankName;
	
	@Column(length = 20)
	private int pincode;
	
	@Column(length = 20)
	private String city;
	

	public Branch() {
		super();
	}

	public Branch(String branchId, String bankName, int pincode, String city) {
		super();
		this.ifsc = branchId;
		this.bankName = bankName;
		this.pincode = pincode;
		this.city = city;
		
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + ifsc + ", bankName=" + bankName + ", pincode=" + pincode + ", city=" + city
				+ "]";
	}

	

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	
	
}
