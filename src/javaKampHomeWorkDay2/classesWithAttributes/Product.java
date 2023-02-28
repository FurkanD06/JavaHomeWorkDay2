package javaKampHomeWorkDay2.classesWithAttributes;

public class Product {
	
	public Product() {
		System.out.println("Yapıcı metot çalıştı");
	}
	
	
	
	public Product(int id, String name, String descreption, double price, int stockAmount, String kod) {
		this.id = id;
		this.name = name;
		this.descreption = descreption;
		this.price = price;
		this.stockAmount = stockAmount;
		this.kod = kod;
	}



	private int id;
	private String name;
	private String descreption;
	private double price;
	private int stockAmount;
	private String kod;
	
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
	
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	
	
}
