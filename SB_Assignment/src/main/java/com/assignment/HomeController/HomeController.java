package com.assignment.HomeController;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.HomeService.BankService;
import com.assignment.Model.Bank;
import com.assignment.dto.BankDTO;



@RestController


public class HomeController 

{
@Autowired
	
	BankService bs;

@RequestMapping(value="/multiDataget",method =RequestMethod.GET)
public Bank multiData()
{
	Bank bank=new Bank();
	      bank.setName("Babu V");
	      bank.setBranchName("RT Nagar");
	      bank.setAccountNumber(3335101002388l);
	      bank.setAmount(900.05f);
	      bank.setIFSC("INDB0000001");
	      
	      return bank;
}	
	
	@RequestMapping(value ="/bankDetails",method = RequestMethod.POST,consumes = "application/json")
	public BankDTO addData(@RequestBody Bank b)
	{
		b.setModifiedDate(new Date());
		b.setMsg("Credited the amount 900.05INR @ Bank  CBS");
	        BankDTO bank =bs.savedata(b);
	        
		return bank;
		
		
	}
}
