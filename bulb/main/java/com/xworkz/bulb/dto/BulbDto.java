package com.xworkz.bulb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="bulb")
@NamedQuery(name = "readAll", query = "select b from BulbDto b")
@NamedQuery(name = "findByName", query = "select find from BulbDto find where find.brandName=:nm")

public class BulbDto {
	@Id
	private int id;
	private String brandName;
	private int price;
	private String color;
	private String type;
	

}
