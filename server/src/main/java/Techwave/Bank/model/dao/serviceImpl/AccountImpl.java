package Techwave.Bank.model.dao.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Techwave.Bank.model.dao.service.AccountService;
import Techwave.Bank.model.pojo.Account;

import Techwave.Bank.model.repositories.AccountRepo;
@Service
public class AccountImpl implements AccountService{
	@Autowired
	AccountRepo accountrepo;


//For inserting a account object in db 
	public String insertAccount(Account a) {
		
		accountrepo.save(a);
		return "Updated Balance = "+a.getBalance();
	}

//User can know his accountId By this method
	public Account getAccountByIds(int id) {
		if(accountrepo.existsById(id))
			return accountrepo.findById(id).get();
		else
			return null;
	}

	
	
}
