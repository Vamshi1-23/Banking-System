package Techwave.Bank.model.dao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Techwave.Bank.model.dao.service.BranchService;
import Techwave.Bank.model.pojo.Branch;
import Techwave.Bank.model.repositories.Branchrepo;
@Service
public class BranchImpl implements BranchService{
	
	@Autowired
	Branchrepo branchrepo;
	
	//To Display Branch names in the registration page
	public List<Branch> getallBranches()
	{
		return branchrepo.findAll();
	}

}
