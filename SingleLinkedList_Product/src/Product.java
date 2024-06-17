
public class Product {
private int id;
private String brand;
private int qty;
private double price;
public Product(int id, String brand, int qty, double price) {
	
	this.id = id;
	this.brand = brand;
	this.qty = qty;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


public boolean equals(Object o) {
	return this.id==((Product)o).id;
}


@Override
public String toString() {
	return "Product [id=" + id + ", brand=" + brand + ", qty=" + qty + ", price=" + price + "]";
}


}
