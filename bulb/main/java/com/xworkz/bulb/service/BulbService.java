package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;

public interface BulbService {
	
	public boolean createAll(List<BulbDto> list);
	
	public List<BulbDto> readAll();
	
	public BulbDto findByBrandName(String name);

}
