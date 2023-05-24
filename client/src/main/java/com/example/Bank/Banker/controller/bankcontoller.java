package com.example.Bank.Banker.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.spi.TransactionalWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.Bank.Banker.model.pojo.Account;
import com.example.Bank.Banker.model.pojo.Admin;
import com.example.Bank.Banker.model.pojo.Branch;
import com.example.Bank.Banker.model.pojo.BranchManager;
import com.example.Bank.Banker.model.pojo.NewUser;
import com.example.Bank.Banker.model.pojo.Transactions;
import com.example.Bank.Banker.model.pojo.User;
import com.example.Bank.Banker.model.pojo.login;
import com.example.Bank.Banker.model.serviceimpl.BankServiceimpl;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@SessionAttributes({ "userId", "userName", "dob", "gender", "aadhar", "email", "phone", "address", "account", "ifsc",
		"Balance" })
@Controller
public class bankcontoller {
	
	
	@Autowired
	BankServiceimpl bankimpl;

	@RequestMapping("/")
	public String home() {
		return "HomeUp";
	}

	@RequestMapping("aboutus")
	public String aboutus() {
		return "aboutus";
	}

	// --------------------INsert NewUser----------------------------
	@RequestMapping("/signup")
	public String setter(Model M) {
		List<Branch> bb = bankimpl.Allbranches();
		M.addAttribute("bb", bb);
		return "registration";
	}

	@RequestMapping("/insertnewUser")
	public String insertUser(Model m, @ModelAttribute("A") NewUser u) {
		if (bankimpl.getbyaadhar(u.getAadhar()) != null) {
			if (u.getAadhar().equals(bankimpl.getbyaadhar(u.getAadhar()).getAadhar())) {
				m.addAttribute("msg1", "User Existing");
			}
		}

		else 
		{
			m.addAttribute("msg","Your Token :"+ bankimpl.insertnewuser(u));
		}
		return "registration";
	}

	@RequestMapping("saveUser")
	public String saveUser(@RequestParam("userId") int id, Model M) {
		NewUser ab = bankimpl.getuserbyId(id);
		User bg = new User();
		bg.setUserId(id);
		bg.setfName(ab.getfName());
		bg.setlName(ab.getlName());
		bg.setEmail(ab.getEmail());
		bg.setGender(ab.getGender());
		bg.setDob(ab.getDob());
		bg.setPhNo(ab.getPhNo());
		bg.setNationality(ab.getNationality());
		bg.setAadhar(ab.getAadhar());
		bg.setIfsc(ab.getIfsc());
		
	
		M.addAttribute("msg","Your token="+ bankimpl.insertUser(bg));
		M.addAttribute("grant", "Granted");
		return "userrequest";
	}

	@RequestMapping("RejectUser")
	public String rej(@RequestParam("userId") int id, Model M) {
		
		M.addAttribute("msg", bankimpl.deletenewUser(id));
		return "userrequest";
	}
	@RequestMapping("Status")
	public String Status()
	{
		return "status";
	}
	
	@RequestMapping("statusCheck")
	public String statusCheck(@RequestParam("token")int token,Model M)
	{
		if(bankimpl.existById(token))
		{
			int pass=bankimpl.getPassword(token);
			M.addAttribute("user", "your UserId :"+token);
			M.addAttribute("password", "Your Password:"+pass);
		}
		if(!bankimpl.existById(token) && bankimpl.newUserExistsById(token))
		{
			M.addAttribute("pending", "Your application is pending/Rejected");
		}
		if(!bankimpl.existById(token) && !bankimpl.newUserExistsById(token))
		{
			M.addAttribute("doesntExist", "Please Apply for Account to check Status");
		}
		
		return "status";
		
	}

	// ---------------------------Login--------------------------
	@RequestMapping("/loginpage")
	public String loginpage(Model M) {
		return "login";
	}

	@RequestMapping("logging")
	public String logging(@ModelAttribute("L") login lg, Model M) {
		String s = String.valueOf(lg.getUserId());
		if (s.length() == 3) {
			if (bankimpl.existAdmin(s)) {
				if (s.equals(bankimpl.getAdmin(s).getAdminId()))
					return "Adminhome";
			} else
				return "login";
		} 
		else 
		{
			if (bankimpl.existById(lg.getUserId()))//Checks Whether the user exists in user table
			{
				User llg = bankimpl.getloginfromdb(lg);
				if (lg.getUserId() == llg.getUserId() && lg.getPassword() == llg.getPassword()) {
					M.addAttribute("userName", llg.getfName());
					M.addAttribute("userId", llg.getUserId());
					M.addAttribute("dob", llg.getDob());
					M.addAttribute("gender", llg.getGender());
					M.addAttribute("aadhar", llg.getAadhar());
					M.addAttribute("email", llg.getEmail());
					M.addAttribute("phone", llg.getPhNo());
					M.addAttribute("address", llg.getAddress());
					System.out.println(llg.getAddress());
					M.addAttribute("account", llg.getAccId().getAccNo());
					M.addAttribute("Balance", llg.getAccId().getBalance());
					M.addAttribute("ifsc", llg.getIfsc());
					return "UserHome";
				} else {
					M.addAttribute("password", "Invalid Password");
					return "login";
				}
			} else {
				M.addAttribute("user", "Invalid UserId");
				return "login";
			}
		}
		return "login";
	}

	@RequestMapping("logout")
	public String logout(SessionStatus session) {
		session.setComplete();
		return "HomeUp";
	}

	@RequestMapping("userhome")
	public String logout() {
		return "UserHome";
	}

	// ---------------------------user operations----------------------------
	@RequestMapping("depopage")
	public String depopage() {
		return "deposit";
	}

	@RequestMapping("selfdeposit")
	public String debit(@SessionAttribute("account") int acc,@RequestParam("amount") double amount, Model M) {
			Transactions T=new Transactions();
			T.setTransType("deposit");
			T.setTansdate(LocalDate.now());
			T.setAmount(amount);
			
			Account a = bankimpl.getAccountById(acc);
			
			T.setAcc(acc);
			String s=bankimpl.insertTransaction(T);
			System.out.println(s);
			double l;
	
			l = a.getBalance() + amount;
			a.setBalance(l);
			M.addAttribute("msg", bankimpl.debit(a));
			return "deposit";
	}
	
	@RequestMapping("OthersAccountDeposit")
	public String OthersAccountDeposit(@RequestParam("accNo") int accno, @RequestParam("amount") double amount, Model M) 
	{
		if(bankimpl.getAccountById(accno)!=null)
		{
		
		return null;
		}
		else
		{
			M.addAttribute("msg", "Enter Proper Account No.");
			return "deposit";
		}
	}

	@RequestMapping("withdrawpage")
	public String with() {
		return "withdraw";
	}

	@RequestMapping("withdraw")
	public String withdraw(@SessionAttribute("account") int accno, @RequestParam("amount") double amount, Model M) {
		Account a = bankimpl.getAccountById(accno);
		double l;
		
		Transactions T=new Transactions();
		T.setTransType("withdraw");
		T.setTansdate(LocalDate.now());
		T.setAmount(amount);
		T.setAcc(accno);
		T.setAccNo(a);
		String s=bankimpl.insertTransaction(T);
		System.out.println(s);
		
		
		if (amount <= a.getBalance()) {
			l = a.getBalance() - amount;
			a.setBalance(l);
			M.addAttribute("msg", bankimpl.debit(a));
		} else {
			M.addAttribute("msg1", "Insufficient Balance");
		}

		return "withdraw";
	}

	@RequestMapping("checkbalpage")
	public String withfd() {
		return "checkbalance";
	}

	@RequestMapping("checkpage")
	public String withgfbh(@SessionAttribute("account") int accno, Model M) {
		Account a = bankimpl.getAccountById(accno);
		M.addAttribute("bal", "Balance = " + a.getBalance());
		return "checkbalance";
	}
	
	@RequestMapping("Transactions")
	public String transactions(Model M)
	{
		List<Transactions> t=bankimpl.getAllTransactions();
		M.addAttribute("t", t);
		return "transaction";
	}
	
	@RequestMapping("TransactionsForUser")
	public String TransactionsForUser(Model M,@SessionAttribute("account") int accno)
	{
		List<Transactions> tuser=bankimpl.getAllTransactionsForUser(accno);
		if(tuser.isEmpty())
			M.addAttribute("noTransactions","You Haven't done any transactions till now");
		M.addAttribute("t", tuser);
		return "UserTransaction";
	}


	@RequestMapping("userHome")
	public String userHome() {
		return "UserHome";
	}

	@RequestMapping("userprofile")
	public String userprofile() {
		return "userprofile";
	}

	@RequestMapping("feedback")
	public String feedback() {
		return "feedback";
	}

	@RequestMapping("adminHome")
	public String adminHome() {
		return "Adminhome";
	}

	@RequestMapping("AdminBranchManager")
	public String Adminbranchmanager(Model M) {
		List<BranchManager> ulist = bankimpl.getBranchManagers();
		M.addAttribute("ulist", ulist);
		return "branchmanager";
	}

	@RequestMapping("getBranches")
	public String getallbranches(Model M) {
		M.addAttribute("msg", bankimpl.Allbranches());
		return "branches";
	}

	@RequestMapping("adminUserRequests")
	public String adminUserRequests(Model M) {
		List<NewUser> ulist = bankimpl.allUserRequests();
		M.addAttribute("ulist", ulist);
		return "userrequest";
	}

	@RequestMapping("adminUserRequest")
	public String adminUserRequest(Model M) {
		List<NewUser> ulist = bankimpl.allUserRequests();
		M.addAttribute("ulist", ulist);
		return "NewUserRequests";
	}

	@RequestMapping("AdminFeedback")
	public String AdminFeedback() {
		return "Adminfeedback";
	}

}
