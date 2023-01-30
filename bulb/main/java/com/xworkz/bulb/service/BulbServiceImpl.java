package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.repo.BulbRepo;
import com.xworkz.bulb.repo.BulbRepoImpl;

public class BulbServiceImpl implements BulbService {

	BulbRepo repo = new BulbRepoImpl();

	public boolean createAll(List<BulbDto> list) {
		if (list != null) {
			for (BulbDto dto : list) {
				if (dto.getId() > 0) {
					if (dto.getBrandName().length() > 2) {
						repo.createAll(dto);
					}
				}
			}
			return true;
		}
		return false;
	}

	public List<BulbDto> readAll() {
		return repo.readAll();

	}

	public BulbDto findByBrandName(String name) {
		if (name != null && name.length() > 2) {
			return repo.findByBrandName(name);
		}
		return null;
	}

}
