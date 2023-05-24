package com.example.Bank.Banker.model.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.Bank.Banker.model.pojo.Account;
import com.example.Bank.Banker.model.pojo.Admin;
import com.example.Bank.Banker.model.pojo.Branch;
import com.example.Bank.Banker.model.pojo.BranchManager;
import com.example.Bank.Banker.model.pojo.NewUser;
import com.example.Bank.Banker.model.pojo.Transactions;
import com.example.Bank.Banker.model.pojo.User;
import com.example.Bank.Banker.model.pojo.login;

public class BankServiceimpl {
	@Autowired
	RestTemplate rest;
	public String url = "http://localhost:9991/";
	
	public Admin getAdmin(String s) {
		return rest.getForObject(url+"getAdmin/"+s, Admin.class);
	}


	public List<Branch> Allbranches() {
		Branch[] branches = rest.getForObject(url + "getBranch", Branch[].class);
		return Arrays.asList(branches);

	}
	
	//----------------------------------users----------------------------
	public String insertUser(User u) {
        String User = rest.postForObject(url + "insertUser", u, String.class);
        return User;
    }

	public List<NewUser> allUserRequests() {
		NewUser[] Requests=rest.getForObject(url+"getnewuser", NewUser[].class);
		return Arrays.asList(Requests);
	}

	public String insertnewuser(NewUser u) {
		  String User = rest.postForObject(url + "insertNewUser", u, String.class);
	        return User;
	}

	public NewUser getuserbyId(int id) {
		NewUser u=rest.getForObject(url+"getnewuserbyId/"+id, NewUser.class);
		return u;
	}
	
	public int getPassword(int id)
	{
		return rest.getForObject(url+"getPassword/"+id,Integer.class);
	}

	public User getloginfromdb(login lg) {
		return rest.getForObject(url+"getUserById/"+lg.getUserId(), User.class);
	}

	//Checks Whether the user exists in user table
	public Boolean existById(int id)
	{
		return rest.getForObject(url+"getExistsById/"+id, Boolean.class);
	}

	public String debit(Account acount) {
		return rest.postForObject(url+"insertAccount",acount,String.class);
	}

	public Account getAccountById(int accno) {
		return rest.getForObject(url+"getAccountById/"+accno, Account.class);
	}

	public boolean existAdmin(String s) {
		return rest.getForObject(url+"existAdmin/"+s, Boolean.class);
	}

	public List<BranchManager> getBranchManagers() {
		BranchManager[] a= rest.getForObject(url+"getBranchManagers", BranchManager[].class);
		return Arrays.asList(a);
	}

	public User getbyaadhar(String aadhar) {
		return rest.getForObject(url+"findByaadhar/"+aadhar, User.class);
	}

	public boolean existaadhar(String aadhar) {
		return rest.getForObject(url+"existByaadhar/"+aadhar, Boolean.class);
	}


	public String deletenewUser(int id) {
	rest.delete(url+"deletenewUser/"+id);
	return "1 row deleted";
	}
	
	public boolean newUserExistsById(int token) {
		return rest.getForObject(url+"newUserExistsById/"+token, Boolean.class);
	}


//---------------------------Transactions---------------------
	
	public String insertTransaction(Transactions t) {
		return rest.postForObject(url+"insertTransaction", t, String.class);
	}


	public List<Transactions> getAllTransactions() {
		Transactions[] T= rest.getForObject(url+"getAllTransactions",Transactions[].class );
		return Arrays.asList(T);
	}


	public List<Transactions> getAllTransactionsForUser(int accno) {
		Transactions[] T= rest.getForObject(url+"getAllTransactionsForUser/"+accno,Transactions[].class );
		return Arrays.asList(T);
	}


	
}
