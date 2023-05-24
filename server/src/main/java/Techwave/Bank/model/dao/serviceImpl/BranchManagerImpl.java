package Techwave.Bank.model.dao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Techwave.Bank.model.dao.service.BranchManagerService;
import Techwave.Bank.model.pojo.BranchManager;
import Techwave.Bank.model.repositories.BranchMgerRepo;
@Service
public class BranchManagerImpl implements BranchManagerService{
	
	
	@Autowired
	BranchMgerRepo branchmgr;
	

	//To display Branch Managers Details in Admin 
	@Override
	public List<BranchManager> getAllB_Mgr() {
		return branchmgr.findAll();
	}

	

}
