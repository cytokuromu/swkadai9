package model;

public class Product {
	 private int productnomber;
	    private String productname;
	    private int price;

	    public Product() {
	    }

	    public Product(int productnomber, String productname, int price) {
	        this.productnomber = productnomber;
	        this.productname = productname;
	        this.price = price;
	    }

	    public int getProductnomber() {
	        return productnomber;
	    }

	    public String getProductname() {
	        return productname;
	    }

	    public void setProductname(String productname) {
	        this.productname = productname;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }
}
