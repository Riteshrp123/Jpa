package com.xworkz.chocolate.service;

import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDto;

public interface ChocolateService {
	
	public boolean createAll(List<ChocolateDto> list);
	
	public List<ChocolateDto> readAll();
	
	public ChocolateDto findByColorAndWeight(String color,int weight);
	
	public ChocolateDto findByPriceAndName(int price,String name);
	
	public boolean updateWeightByNameAndColor(int weight,String name,String color);
	
	public boolean updateNameByIdAndWeight(String name,int id,int weight);
	
	public boolean DeleteBycolorAndName(String color,String name);

}
