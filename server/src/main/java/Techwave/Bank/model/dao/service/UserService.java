package Techwave.Bank.model.dao.service;

import java.util.List;

import Techwave.Bank.model.pojo.Account;
import Techwave.Bank.model.pojo.NewUser;
import Techwave.Bank.model.pojo.User;

public interface UserService {

//----------------newUsers----------------
		String insertnewuser(NewUser U);
		NewUser getnewuserbyId(int id);
		List<NewUser> getnewusers();
		void deletenewUser(int id);
		
//-------------Users---------
		String insertuser(User U, Account a);
		String deleteUser(User u);
		List<User> getUser();
		int getPassword(int p);
		User getUserById(int id);
		Boolean existById(int id);
		 User findByaadhar(String id);
		 
//---------------------accounts--------
		String insertaccount(Account a);
		
	
		
}
