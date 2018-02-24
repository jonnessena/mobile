package com.claro.mobile.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long code;
	private String model;
	private int price;
	private String brand;
	private String phot​oUrl;
	private String date;

	public Mobile(String model, int price, String brand, String photoUrl, String date) {
		this.model = model;
		this.price = price;
		this.brand = brand;
		this.phot​oUrl = photoUrl;
		this.date = date;
	}

	public Mobile() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPhot​oUrl() {
		return phot​oUrl;
	}

	public void setPhot​oUrl(String phot​oUrl) {
		this.phot​oUrl = phot​oUrl;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Mobile [code=" + code + ", model=" + model + ", price=" + price + ", brand=" + brand + ", date=" + date
				+ "]";
	}
}
