package com.xworkz.chocolate;

import java.util.Arrays;
import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDto;
import com.xworkz.chocolate.service.ChocolateService;
import com.xworkz.chocolate.service.ChocolateServiceImpl;

public class ChocolateTester {

	public static void main(String[] args) {

		ChocolateService service = new ChocolateServiceImpl();

		ChocolateDto dto = new ChocolateDto(1, "Cadbury", "Brown", 100, 50);
		ChocolateDto dto1 = new ChocolateDto(2, "Munch", "Black", 80, 60);
		ChocolateDto dto2 = new ChocolateDto(3, "5star", "coffy", 50, 40);
		ChocolateDto dto3 = new ChocolateDto(4, "Candy", "Red", 70, 30);
		ChocolateDto dto4 = new ChocolateDto(5, "Hajmola", "Yellow", 30, 70);
		ChocolateDto dto5 = new ChocolateDto(6, "Perk", "Blue", 40, 80);

		List<ChocolateDto> dtos = Arrays.asList(dto, dto1, dto2, dto3, dto4, dto5);
		service.createAll(dtos);

		for (ChocolateDto choco : service.readAll()) {
			System.out.println(choco);
			System.out.println(service.findByColorAndWeight("Red", 30));
			System.out.println(service.findByPriceAndName(40, "Perk"));
			System.out.println(service.updateWeightByNameAndColor(90, "Hajmola", "Yellow"));
			System.out.println(service.updateNameByIdAndWeight("KitKat", 5, 70));
			System.out.println(service.DeleteBycolorAndName("Blue", "Perk"));
		}
	}
}