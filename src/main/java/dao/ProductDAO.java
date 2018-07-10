package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductDAO {
	List<String> product_nomber=new ArrayList<String>();
	List<String> product_name=new ArrayList<String>();
	List<String> price=new ArrayList<String>();

    public List<Product> findAll() {
      
        List<Product> productList = new ArrayList<Product>();
        
        return productList;
    }
}
