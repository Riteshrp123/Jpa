package com.xworkz.bulb.repo;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;

   public interface BulbRepo {

    public boolean createAll(BulbDto dto);
	
	public List<BulbDto> readAll();
	
	public BulbDto findByBrandName(String name);
}
