package com.xworkz.shirts.repo;

import java.util.List;

import com.xworkz.shirts.dto.ShirtsDto;

public interface ShirtsRepo {
	
	public boolean save(ShirtsDto dto);
	
	public List<ShirtsDto> readAll();

}
