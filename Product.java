import java.text.SimpleDateFormat;
import java.util.Calendar;
//Kadir PEKDEMÝR 150121069

public class Product {
   private String productName;
   private java.util.Calendar saleDate;
   private double price;
   SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
   public Product(String productName, Calendar saleDate, double price) {
	this.productName = productName;
	this.saleDate = saleDate;
	this.price = price;
   }
   
   
@Override
public String toString() {
	return "Product [productName=" + productName + ", saleDate=" + sdf.format(saleDate.getTime())+ ", price=" + price + "]";
}



public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public java.util.Calendar getSaleDate() {
	return saleDate;
}
public void setSaleDate(java.util.Calendar saleDate) {
	this.saleDate = saleDate;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
