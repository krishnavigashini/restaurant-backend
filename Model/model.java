package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "food_details")
public class model {
@Id
@GeneratedValue
@Column(name="id")
private int id;
@Column(name="food_name")
private String food_name;
@Column(name="price")
private int price;
@Column(name="quantity")
private int quantity;
@Column(name="rating")
private float rating;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFood_name() {
	return food_name;
}

public void setFood_name(String food_name) {
	this.food_name = food_name;
}
public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}

public model(int id, String food_name, int price, int quantity, float rating) {
	super();
	this.id = id;
	this.food_name = food_name;
	this.price = price;
	this.quantity = quantity;
	this.rating = rating;
}

public model() {

}

}