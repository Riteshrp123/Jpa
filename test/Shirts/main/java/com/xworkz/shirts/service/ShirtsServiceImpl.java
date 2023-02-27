package com.xworkz.shirts.service;

import java.util.List;

import com.xworkz.shirts.dto.ShirtsDto;
import com.xworkz.shirts.repo.ShirtsRepo;
import com.xworkz.shirts.repo.ShirtsRepoImpl;

public class ShirtsServiceImpl implements ShirtsService {

	ShirtsRepo repo = new ShirtsRepoImpl();
	
	@Override
	public boolean save(ShirtsDto dto) {
		 if(dto!=null && dto.getName().length()>=3) { 
			 return  repo.save(dto);	 
		 }
		return false;
	}

	@Override
	public List<ShirtsDto> readAll() {
		return repo.readAll();
	}

}
