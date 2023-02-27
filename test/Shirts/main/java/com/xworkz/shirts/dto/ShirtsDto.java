package com.xworkz.shirts.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="shirts")
@NamedQuery(name="readAll", query="select dto from ShirtsDto dto")
public class ShirtsDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String color;
	private String price;

	
	
	public ShirtsDto() {
		super();
	}



	public ShirtsDto(String name, String color, String price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "ShirtsDto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
