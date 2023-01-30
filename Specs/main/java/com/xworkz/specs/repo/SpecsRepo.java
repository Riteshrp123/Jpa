package com.xworkz.specs.repo;

import java.util.List;

import com.xworkz.specs.dto.SpecsDto;

public interface SpecsRepo {
	
	public boolean storeAll(SpecsDto dto);
	
    public List<SpecsDto> readAll();
	
	public SpecsDto findByShapeAndPrice(String shape,int price);
	
	public boolean updatePriceByName(int price,String name);
	
	public boolean updateColorByPriceAndShape(String color,int price,String shape);
	
	public boolean deleteByPriceAndColor(int price,String color);
	
	public boolean deleteByNameAndId(String name,int id);

}
