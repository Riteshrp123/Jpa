package com.xworkz.specs.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "specs")
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "readAll", query = "select specs from SpecsDto specs")
@NamedQuery(name = "findByShapeAndPrice", query = "select specs from SpecsDto specs where specs.shape=:sp and specs.price=:pr")
@NamedQuery(name = "updatePriceByName", query = "update SpecsDto dto set dto.price=:pr where dto.name=:nm")
@NamedQuery(name = "updateColorByPriceAndShape", query = "update SpecsDto dto set dto.color=:col where dto.price=:pri and dto.shape=:shp")
@NamedQuery(name = "deleteByPriceAndColor", query = "delete from SpecsDto dto where dto.price=:pr and dto.color=:col")
@NamedQuery(name = "deleteByNameAndId", query = "delete from SpecsDto dto where dto.name=:nm and dto.id=:id")
public class SpecsDto {

	@Id
	private int id;
	private String name;
	private String color;
	private String shape;
	private int price;

}
