package Techwave.Bank.model.dao.service;
import Techwave.Bank.model.pojo.Account;

public interface AccountService {
	public String insertAccount(Account a);
	public Account getAccountByIds(int id);


}
