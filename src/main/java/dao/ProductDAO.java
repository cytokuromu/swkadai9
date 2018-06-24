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
	private final String DRIVER_NAME = "org.apache.derby.jdbc.ClientDriver";
    private final String JDBC_URL = "jdbc:derby://localhost:1527/db0104";
    private final String DB_USER = "db";
    private final String DB_PASS = "db";

    public List<Product> findAll() {
        Connection conn = null;
        List<Product> productList = new ArrayList<Product>();
        try {
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
            String sql = "SELECT PRODUCT_NO,PRODUCT_NAME,PRICE FROM PRODUCT ORDER BY PRODUCT_NO DESC";
            PreparedStatement pStmt = conn.prepareStatement(sql);

            ResultSet rs = pStmt.executeQuery();

            while (rs.next()) {
                int productnomber = rs.getInt("PRODUCT_NO");
                String productname = rs.getString("PRODUCT_NAME");
                int price = rs.getInt("PRICE");
                Product product = new Product(productnomber, productname, price);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return productList;
    }
}
