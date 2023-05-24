package Techwave.Bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Techwave.Bank.model.dao.service.AccountService;
import Techwave.Bank.model.dao.service.AdminService;
import Techwave.Bank.model.dao.service.BranchManagerService;
import Techwave.Bank.model.dao.service.BranchService;
import Techwave.Bank.model.dao.service.UserService;
import Techwave.Bank.model.pojo.Account;
import Techwave.Bank.model.pojo.Admin;
import Techwave.Bank.model.pojo.Branch;
import Techwave.Bank.model.pojo.BranchManager;
import Techwave.Bank.model.pojo.NewUser;
import Techwave.Bank.model.pojo.User;
import Techwave.Bank.model.repositories.AccountRepo;
import Techwave.Bank.model.repositories.Adminrepo;
import Techwave.Bank.model.repositories.BranchMgerRepo;
import Techwave.Bank.model.repositories.Branchrepo;
import Techwave.Bank.model.repositories.User_repo;
import Techwave.Bank.model.repositories.newUser_repo;

@SpringBootTest
class BankApplicationTests {

	@MockBean
	newUser_repo r;

	@Autowired
	UserService service;
	@MockBean
	User_repo repo;

	@Autowired
	BranchService service1;
	@MockBean
	Branchrepo repo1;

	@Autowired
	BranchManagerService service2;
	@MockBean
	BranchMgerRepo repo2;

	@Autowired
	AccountService service3;
	@MockBean
	AccountRepo repo3;

	
	@Autowired
AdminService service4;
@MockBean
Adminrepo repo4;

	@Test
	void contextLoads() {
	}

//---------------------------------------Users-------------------------------------------//

	@Test
	void testgetUser() {
		Account a = new Account();
		when(repo.findAll()).thenReturn(Stream.of(
				new User(1, "fName", "lName", "email", "gender", LocalDate.parse("2000-10-09"), "phNo", "nationality",
						12, "aadhar", "address", "ifsc", a),
				new User(2, "cba", "zyx", "cba@gmail.com", "male", LocalDate.parse("2000-11-09"), "1234567891",
						"indian", 1, "hybd", "ifsc1", "ifsc1", a))
				.collect(Collectors.toList()));
		assertEquals(2, service.getUser().size());
	}

	@Test
	void testinsertUser() {
		Account a = new Account();
		User u = new User(1, "fName", "lName", "email", "gender", LocalDate.parse("2000-10-09"), "phNo", "nationality",
				12, "aadhar", "address", "ifsc", a);
		when(repo.save(u)).thenReturn(u);
		String s1 = "1 ";
		assertTrue(s1.equals(service.insertuser(u, a)));

	}

	@Test
	void testInsertnewuser() {
		NewUser n = new NewUser(1000, "fName", "lName", "email", "gender", LocalDate.parse("2000-09-09"), "phNo",
				"nationality", "aadhar", "address", "ifsc", "granted");
		when(r.save(n)).thenReturn(n);
		String s1 = "1000 ";
		System.out.println(service.insertnewuser(n));
		assertTrue(s1.equals(service.insertnewuser(n)));

	}

	@Test
	void testexistById() {
		Account a = new Account(1000000, 1000);
		User u = new User(1001, "fName", "lName", "email", "gender", LocalDate.parse("2000-10-09"), "phNo",
				"nationality", 12, "aadhar", "address", "ifsc", a);
		int i = 1001;
		assertTrue(i == u.getUserId());
	}

	@Test
	void testgetnewusers() {
		
		NewUser n = new NewUser();
		when(r.findAll()).thenReturn(Stream.of(
				new NewUser(1, "fName", "lName", "email", "gender", LocalDate.parse("2000-10-09"), "phNo",
						"nationality", "aadhar", "address", "ifsc", "rejected"),
				new NewUser(2, "cba", "zyx", "cba@gmail.com", "male", LocalDate.parse("2000-11-09"), "1234567891",
						"indian", "hybd", "ifsc1", "ifsc1","rejected"))
				.collect(Collectors.toList()));
		assertEquals(2, service.getnewusers().size());
	}

	
	  @Test
	  void testgetnewuserbyId() { 
		  Account a=new Account(); Optional<NewUser>
	  n=Optional.of(new NewUser(1001,"fName","lName","email","gender",
	  LocalDate.parse("2000-10-09"),"phNo",
	  "nationality","aadhar","address","ifsc","grant"));
	  when(r.findById(1001)).thenReturn(n);
	  assertEquals(n.get(), service.getnewuserbyId(1001)); 
	  }
	 

	@Test
	void testinsertaccount() {
		Account a = new Account(1000000, 1000);
		when(repo3.save(a)).thenReturn(a);
		System.out.println(service.insertaccount(a));
		String s = "1000000inserted";
		assertTrue(s.equals(service.insertaccount(a)));

	}

	@Test
	void testgetPassword() {
		Account a = new Account(1000000, 1000);
		when(repo3.save(a)).thenReturn(a);
		User u = new User(1001, "fName", "lName", "email", "gender", LocalDate.parse("2000-10-09"), "phNo",
				"nationality", 12, "aadhar", "address", "ifsc", a);
		when(repo.save(u)).thenReturn(u);
		int i = 12;
		assertTrue(i == u.getPassword());
	}

	@Test
    void testgetUserById(){
        Account a=new Account(1000000,1000);
        Optional<User> u=Optional.of(new User(1001,"fName","lName","email","gender", LocalDate.parse("2000-10-09"),"phNo",
                "nationality",12,"aadhar","address","ifsc",a));
        int i=1001;
        when(repo.findById(i)).thenReturn(u);
        assertEquals(u.get(),service.getUserById(i));
        
    }
	
	@Test
    void testfindByaadhar() {
        Account a=new Account(1000000,1000);
        User u=new User(1001,"fName","lName","email","gender", LocalDate.parse("2000-10-09"),"phNo",
                "nationality",12,"aadhar","address","ifsc",a);
        repo.save(u);
        when(repo.findByaadhar("aadhar")).thenReturn(u);
        assertEquals(u,service.findByaadhar("aadhar"));
    }

	// -------------------------------------------Branches--------------------------------------//
	@Test
	void testgetAll() {
		when(repo1.findAll()).thenReturn(
				Stream.of(new Branch("12345", "Bank", 21, "Miyapur"), new Branch("23451", "Bank", 22, "Madhapur"))
						.collect(Collectors.toList()));
		assertEquals(2, service1.getallBranches().size());
	}

	// ------------------------------------Managers------------------------------------------//
	@Test
	void testgetAll1() {
		when(repo2.findAll()).thenReturn(Stream.of(
				new BranchManager("234561", "Sai", "Ram", "Miyapur,2-34", "Male", LocalDate.parse("2020-10-01"),
						LocalDate.parse("2020-10-01"), new Branch("12345", "Bank", 21, "Miyapur"),
						new Admin("1223", "355465", "Sairam")),
				new BranchManager("234561", "Sai", "Ram", "Miyapur,2-34", "Male", LocalDate.parse("2020-10-01"),
						LocalDate.parse("2020-10-01"), new Branch("12345", "Bank", 21, "Miyapur"),
						new Admin("1223", "355465", "Sairam")))
				.collect(Collectors.toList()));
		assertEquals(2, service2.getAllB_Mgr().size());
	}

//====================================Account=============================================//

	@Test
	void testinsertAccount() {
		Account A = new Account(1234, 2332545);
		when(repo3.save(A)).thenReturn(A);
		String str = "Updated Balance = " + A.getBalance();
		assertTrue(str.equals(service3.insertAccount(A)));
		verify(repo3, times(1)).save(A);
	}

	@Test
	void testaccountbyid()
	{
	   Account a1=new Account(123434,22222545);
	   when(repo3.save(a1)).thenReturn(a1);
	   int i=123434;
	   assertTrue(i==a1.getAccNo());
	      
	}

	
}
