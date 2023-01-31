package com.xworkz.chocolate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chocolate")
@NamedQuery(name = "readAll", query = "select choco from ChocolateDto choco")
@NamedQuery(name = "findByColorAndWeight", query = "select choco from ChocolateDto  choco where choco.color=:col and choco.weight=:wh")
@NamedQuery(name = "findByPriceAndName", query = "select choco from ChocolateDto choco where choco.price=:pr and choco.name=:nm")
@NamedQuery(name = "updateWeightByNameAndColor", query = "update ChocolateDto dto set dto.weight=:wh where dto.name=:nm and dto.color=:col")
@NamedQuery(name = "updateNameByIdAndWeight", query = "update ChocolateDto dto set dto.name=:nm where dto.id=:id and dto.weight=:wh")
@NamedQuery(name = "DeleteBycolorAndName", query = "delete from ChocolateDto dto where dto.color=:col and dto.name=:nm")
public class ChocolateDto {

	@Id
	private int id;
	private String name;
	private String color;
	private int price;
	private int weight;

}
