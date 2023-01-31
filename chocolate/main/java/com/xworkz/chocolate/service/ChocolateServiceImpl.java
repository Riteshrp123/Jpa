package com.xworkz.chocolate.service;

import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDto;
import com.xworkz.chocolate.repo.ChocolateRepo;
import com.xworkz.chocolate.repo.ChocolateRepoImpl;

public class ChocolateServiceImpl implements ChocolateService {

	ChocolateRepo repo = new ChocolateRepoImpl();

	public boolean createAll(List<ChocolateDto> list) {
		if (list != null) {
			for (ChocolateDto dto : list) {
				if (dto.getId() > 0) {
					if (dto.getName().length() > 2) {
						repo.createAll(dto);
					}
				}

			}
			return true;
		}
		return false;
	}

	public List<ChocolateDto> readAll() {
		return repo.readAll();
	}

	public ChocolateDto findByColorAndWeight(String color, int weight) {
		if (color != null && color.length() > 2) {
			if (weight > 10) {
				return repo.findByColorAndWeight(color, weight);
			}

		}
		return null;
	}

	public ChocolateDto findByPriceAndName(int price, String name) {
		if (price > 0) {
			if (name != null && name.length() > 2) {
				return repo.findByPriceAndName(price, name);
			}
		}
		return null;
	}

	public boolean updateWeightByNameAndColor(int weight, String name, String color) {
		if (weight > 10) {
			if (name != null && name.length() > 2) {
				if (color != null && color.length() > 2) {
					return repo.updateWeightByNameAndColor(weight, name, color);
				}
			}
		}
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, int weight) {
		if (name != null && name.length() > 2) {
			if (id > 0) {
				if (weight > 10) {
					return repo.updateNameByIdAndWeight(name, id, weight);
				}
			}
		}
		return false;
	}

	public boolean DeleteBycolorAndName(String color, String name) {
		if (color != null && color.length() > 2) {
			if (name != null && name.length() > 2) {
				return repo.DeleteBycolorAndName(color, name);
			}
		}
		return false;
	}
}
