package Techwave.Bank.model.dao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Techwave.Bank.model.dao.service.UserService;
import Techwave.Bank.model.pojo.Account;
import Techwave.Bank.model.pojo.NewUser;
import Techwave.Bank.model.pojo.User;
import Techwave.Bank.model.repositories.AccountRepo;
import Techwave.Bank.model.repositories.User_repo;
import Techwave.Bank.model.repositories.newUser_repo;
@Service
public class UserImpl implements UserService{

	@Autowired
	User_repo user_repo;
	
	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	newUser_repo newuser_repo;
	
	@Override
	public String insertuser(User U,Account a) {
		List<User> ulist=user_repo.findAll();
		U.setAccId(a);
		int n;
		if(ulist.isEmpty())
		{
			n=2222;
			U.setPassword(n);
			user_repo.save(U);
			return U.getUserId()+" ";
		}
		else
		{
			n=user_repo.maximumpassword()+1;
			U.setPassword(n);
			user_repo.save(U);
			return U.getUserId()+" ";
		}
	}


	@Override
	public String deleteUser(User u) {
		
		return null;
	}

	@Override
	public List<User> getUser() {
		return user_repo.findAll();
	}

	public String insertnewuser(NewUser u) {
		List<NewUser> ulist=newuser_repo.findAll();
		int n;
		if(ulist.isEmpty())
		{
			n=1000;
			u.setUserId(n);
			newuser_repo.save(u);
			return u.getUserId()+" ";
		}
		else
		{
			n=newuser_repo.maximumUserId()+1;
			u.setUserId(n);
			newuser_repo.save(u);
			return u.getUserId()+" ";
		}
	}

	public List<NewUser> getnewusers()
	{
		return newuser_repo.findAll();
	}

	public NewUser getnewuserbyId(int id) {
		return newuser_repo.findById(id).get();
	}

	@Override
	public String insertaccount(Account a) {
		List<Account> alist=accountRepo.findAll();
		int n;
		if(alist.isEmpty())
		{
			n=1000000;
			a.setAccNo(n);
			a.setBalance(0);
			accountRepo.save(a);
		}
		else
		{
			n=accountRepo.maximumAccId()+1;
			a.setAccNo(n);
			a.setBalance(0);
			accountRepo.save(a);
		}
		return a.getAccNo()+"inserted";
	}

	public int getPassword(int p) {
		return user_repo.findById(p).get().getPassword();
	}

	public User getUserById(int id) {
		return user_repo.findById(id).get();
	}

	public Boolean existById(int id)
	{
		return user_repo.existsById(id);
	}

	public User findByaadhar(String id) {
		return user_repo.findByaadhar(id);
	}

	public void deletenewUser(int id) {
	
		newuser_repo.deleteById(id);
	 
	}


	public Boolean newUserExistsById(int id) {
		return newuser_repo.existsById(id);
	}

}
