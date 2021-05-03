package Entities.Concrete;

import java.util.Date;

import Entities.Abstract.Entity;

public class Game implements Entity {
	private int id;
	private String gameName;
	private Date  releaseDate;
	private double discountRate;
	private String description;
	private double price;
	private double aftePrice;
	
	
	public Game() {
	
	}
	
	
	public Game(int id, String gameName, Date releaseDate,
			double discountRate, String description, double price,double afterPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.releaseDate = releaseDate;
		this.discountRate = discountRate;
		this.description = description;
		this.price= price;
		this.aftePrice=afterPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getAftePrice() {
		return aftePrice;
	}


	public void setAftePrice(double aftePrice) {
		this.aftePrice = aftePrice;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	

}
