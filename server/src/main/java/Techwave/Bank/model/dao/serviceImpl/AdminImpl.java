package Techwave.Bank.model.dao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Techwave.Bank.model.dao.service.AdminService;
import Techwave.Bank.model.pojo.Admin;
import Techwave.Bank.model.repositories.Adminrepo;
@Service
public class AdminImpl implements AdminService{
	
	@Autowired
	Adminrepo adminrepo;

	@Override
	public List<Admin> getallAdmins() {
		return adminrepo.findAll();
	}

	//To Display the name of the admin When he logins
	public Admin getAdmin(String id) {
		return adminrepo.findById(id).get();
	}

	//To validate Admin i.e to know whether admin exists or not
	public Boolean existAdmin(String id) {
		return adminrepo.existsById(id);
	}

	
}
