package com.xworkz.specs;

import java.util.Arrays;
import java.util.List;

import com.xworkz.specs.dto.SpecsDto;
import com.xworkz.specs.service.SpecsService;
import com.xworkz.specs.service.SpecsServiceImpl;

public class SpecsTester {
	public static void main(String[] args) {

		SpecsService service = new SpecsServiceImpl();

		SpecsDto dto = new SpecsDto(5, "Titan", "Red", "Round", 5000);
		SpecsDto dto1 = new SpecsDto(2, "LencKart", "Green", "Air", 4500);
		SpecsDto dto2 = new SpecsDto(3, "FastTrack", "Blue", "Rectagle", 3000);
		SpecsDto dto3 = new SpecsDto(4, "Ray Ban", "Golden", "Round", 6000);
		SpecsDto dto4 = new SpecsDto(1, "Prade", "White", "Four angle", 2000);

		List<SpecsDto> list = Arrays.asList(dto, dto1, dto2, dto3, dto4);
		service.storeAll(list);

		List<SpecsDto> list1 = service.readAll();
		for (SpecsDto specs : list1) {
			System.out.println(specs);

			SpecsDto dtos = service.findByShapeAndPrice("Rectagle", 3000);
			System.out.println(dtos);
			System.out.println(service.updatePriceByName(5500, "Ray Ban"));
			System.out.println(service.updateColorByPriceAndShape("Black", 4500, "Air"));
			System.out.println(service.deleteByPriceAndColor(2000, "White"));
			System.out.println(service.deleteByNameAndId("LencKart", 2));
		}
	}

}