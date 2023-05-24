package Techwave.Bank.model.dao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Techwave.Bank.model.dao.service.TransactionService;
import Techwave.Bank.model.pojo.Account;
import Techwave.Bank.model.pojo.Transactions;
import Techwave.Bank.model.repositories.AccountRepo;
import Techwave.Bank.model.repositories.TransactionRepo;

@Service
public class TransactionImpl implements TransactionService {

	@Autowired
	TransactionRepo transrepo;

	@Autowired
	AccountRepo accountrepo;
	
	@Override
	public String insertTransaction(Transactions t) {
		// TODO Auto-generated method stub
		List<Transactions> tlist=transrepo.findAll();
		Account a=accountrepo.findById(t.getAcc()).get();
		int n;
		String l;
		if(tlist.isEmpty())
		{
			n=1000000;
			l=String.valueOf(n);
			t.setTransId(l);
			t.setAccNo(a);
			System.out.println(t);
			transrepo.save(t);
		}
		else
		{
			n=transrepo.maximumTransId()+1;
			l=String.valueOf(n);
			t.setTransId(l);
			t.setAccNo(a);
			System.out.println(t);
			transrepo.save(t);
		}
		return t.getTransId()+"inserted";
	}

	public List<Transactions> getAllTransactions() {
		// TODO Auto-generated method stub
		return transrepo.findAll();
	}

	public List<Transactions> getAllTransactionsForUser(int accno) {
		// TODO Auto-generated method stub
		return transrepo.transactionsForUser(accno);
	}
	
	
}
