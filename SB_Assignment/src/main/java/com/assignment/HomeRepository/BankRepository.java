package com.assignment.HomeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.assignment.Model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long>
{

	
	

}
