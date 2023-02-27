package com.xworkz.shirts.service;

import java.util.List;

import com.xworkz.shirts.dto.ShirtsDto;

public interface ShirtsService {
	
     public boolean save(ShirtsDto dto);
	
	 public List<ShirtsDto> readAll();

}
