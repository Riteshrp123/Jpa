package com.xworkz.bulb;

import java.util.Arrays;
import java.util.List;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.service.BulbService;
import com.xworkz.bulb.service.BulbServiceImpl;

public class BulbTester {

	public static void main(String[] args) {

		BulbService service = new BulbServiceImpl();

		BulbDto dto = new BulbDto(1, "Phillips", 200, "White", "Electric");
		BulbDto dto1 = new BulbDto(2, "Havels", 250, "Green", "Battry");
		BulbDto dto2 = new BulbDto(3, "Finolex", 100, "Red", "Led");
		BulbDto dto3 = new BulbDto(4, "Syska", 150, "Gold", "Electric");
		BulbDto dto4 = new BulbDto(5, "Wipro", 230, "Yellow", "Solar");
		BulbDto dto5 = new BulbDto(6, "Corvi", 300, "Green", "Battry");
		BulbDto dto6 = new BulbDto(7, "Usha", 240, "White", "Oxyled");
		BulbDto dto7 = new BulbDto(8, "Panasonic", 190, "Blue", "Led");

		List<BulbDto> list = Arrays.asList(dto3, dto4, dto5, dto6, dto7);
		service.createAll(list);

		List<BulbDto> read = service.readAll();
		for (BulbDto bulbDto : read) {
			System.out.println(bulbDto);

			BulbDto dtot = service.findByBrandName("Wipro");
            System.out.println(dtot);
		}
	}
}
