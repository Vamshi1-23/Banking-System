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
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "B_transactions")
@NamedQueries({
	@NamedQuery(name="Transactions.maximumTransId",
				query = "select max(b.transId) from Transactions b"),
	@NamedQuery(name="Transactions.transactionsForUser",
	query = "from Transactions b where accNo.accNo=:acno")
})
public class Transactions {

	@Id
	@Column(length = 20)
	private String transId;
	
	@Column(length = 20)
	private String transType;
	
	@Column(length = 20)
	private double amount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate tansdate;
	
	@OneToOne
	@JoinColumn(name="accNo",referencedColumnName = "accNo")
	private Account accNo;
	
	@Transient
	private Integer acc;

	@Override
	public String toString() {
		return "Transactions [transId=" + transId + ", transType=" + transType + ", amount=" + amount + ", tansdate="
				+ tansdate + ", accNo=" + accNo + ", acc=" + acc + "]";
	}

	public Integer getAcc() {
		return acc;
	}

	public void setAcc(Integer acc) {
		this.acc = acc;
	}

	public Transactions(String transId, String transType, double amount, LocalDate tansdate, Account accNo) {
		super();
		this.transId = transId;
		this.transType = transType;
		this.amount = amount;
		this.tansdate = tansdate;
		this.accNo = accNo;
	}

	public Transactions() {
		super();
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	

	public LocalDate getTansdate() {
		return tansdate;
	}

	public void setTansdate(LocalDate tansdate) {
		this.tansdate = tansdate;
	}

	public Account getAccNo() {
		return accNo;
	}

	public void setAccNo(Account accNo) {
		this.accNo = accNo;
	}

	

	
	
}
