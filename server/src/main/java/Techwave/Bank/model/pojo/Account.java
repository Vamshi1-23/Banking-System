package Techwave.Bank.model.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "B_Account")
@NamedQueries({
	@NamedQuery(name="Account.maximumAccId",
				query = "select max(b.accNo) from Account b")
})
public class Account {

	@Id
	@Column(length = 20)
	private int accNo;

	@Column(length = 20)
	private double balance;
	
	

	public Account(int accId, double balance) {
		super();
		this.accNo = accId;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accId) {
		this.accNo = accId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	

}
