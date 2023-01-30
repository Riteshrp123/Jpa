package com.xworkz.specs.service;

import java.util.List;

import com.xworkz.specs.dto.SpecsDto;
import com.xworkz.specs.repo.SpecsRepo;
import com.xworkz.specs.repo.SpecsRepoImpl;

public class SpecsServiceImpl implements SpecsService {

	SpecsRepo repo = new SpecsRepoImpl();

	public boolean storeAll(List<SpecsDto> list) {
		if (list != null) {
			for (SpecsDto dto : list) {
				if (dto.getId() > 0) {
					repo.storeAll(dto);
				}
			}
			return true;
		}
		return false;
	}

	public List<SpecsDto> readAll() {
		return repo.readAll();
	}

	public SpecsDto findByShapeAndPrice(String shape, int price) {
		if (shape != null && shape.length() > 2) {
			if (price > 1000) {
				return repo.findByShapeAndPrice(shape, price);
			}
		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
		if (price > 1000) {
			if (name != null && name.length() > 2) {
				return repo.updatePriceByName(price, name);
			}
		}
		return false;
	}

	public boolean updateColorByPriceAndShape(String color, int price, String shape) {
		if (color != null && color.length() > 2) {
			if (price > 1000) {
				if (shape != null && shape.length() > 2) {
					return repo.updateColorByPriceAndShape(color, price, shape);
				}
			}
		}
		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if (price > 1000) {
			if (color != null && color.length() > 2) {
				return repo.deleteByPriceAndColor(price, color);
			}
		}
		return false;
	}

	public boolean deleteByNameAndId(String name, int id) {
		if (name != null && name.length() > 2) {
			if (id > 0) {
				return repo.deleteByNameAndId(name, id);
			}
		}
		return false;
	}
}