package model;

import java.sql.Date;

public class Review {
	 private int nomber;
	    private String productName; 
	    private String comment;
	    private Date posted;

	    public Review() {
	    }
	/*
	    public Review(String productName, String comment) {
	        this.productName = productName;
	        this.price = price;
	    }
	*/
	    public Review(int nomber, String productName, String comment,Date posted) {
	        this.nomber = nomber;
	        this.productName = productName;
	        this.comment = comment;
	        this.posted=posted;
	    }
	    
	    public Review(int nomber, String productName, String comment) {
	        this.nomber = nomber;
	        this.productName = productName;
	        this.comment = comment;
	    }

	    public int getNomber() {
	        return nomber;
	    }

	    public String getProductName(){
	        return productName;
	    }
	    
	    public String getComment() {
	        return comment;
	    }

	    public Date getPosted() {
	        return posted;
	    }
}
