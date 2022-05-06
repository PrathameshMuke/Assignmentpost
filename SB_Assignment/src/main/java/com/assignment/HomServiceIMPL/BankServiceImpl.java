package com.assignment.HomServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.HomeRepository.BankRepository;
import com.assignment.HomeService.BankService;
import com.assignment.Model.Bank;
import com.assignment.dto.BankDTO;


@Service
public class BankServiceImpl implements BankService
{
	@Autowired
	BankRepository br;
	
	
	

	@Override
	public BankDTO savedata(Bank b) {
		 Bank bank=br.save(b);
		 	BankDTO dto=convertBankToBankDTO(bank);
		return dto;
	}
	
	public BankDTO convertBankToBankDTO(Bank b) {
		BankDTO dto=new BankDTO();
		dto.setAccountNumber(b.getAccountNumber());
		dto.setModifiedDate(b.getModifiedDate());
		dto.setMsg(b.getMsg());
		return dto;
	}

	
}
