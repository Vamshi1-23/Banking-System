package Techwave.Bank.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Techwave.Bank.model.pojo.Admin;


public interface Adminrepo extends JpaRepository<Admin,String> {

}
