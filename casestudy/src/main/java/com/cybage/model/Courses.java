package com.cybage.model;

public class Courses {
	private int id;
	private String name;
	private int price;
	private int duration;
	private String author;
	private String description;
	private String image;
	private int sub;
	
	
	public Courses() {
		super();
	}
	public Courses(int id,String name,int price,int duration, String author, String description, String image,int sub) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.duration = duration;
		this.author = author;
		this.description = description;
		this.image = image;
		this.sub = sub;
		
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getSub() {
		return sub;
	}
	public void setSub(int sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", price=" + price + ", duration=" + duration + ", author=" + author + ", description="+ description +" , image=" + image +", sub=" +sub +"]";
	}
}
