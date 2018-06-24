package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Review;

public class ReviewDAO {
	private final String DRIVER_NAME = "org.apache.derby.jdbc.ClientDriver";
    private final String JDBC_URL = "jdbc:derby://localhost:1527/db0104";
    private final String DB_USER = "db";
    private final String DB_PASS = "db";

    public List<Review> findAll() {
        Connection conn = null;
        List<Review> reviewList = new ArrayList<Review>();
        try {
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
            String sql = "SELECT NOMBER,PRODUCT_NAME,COMMENT,POSTED FROM REVIEW ORDER BY NOMBER DESC";
            PreparedStatement pStmt = conn.prepareStatement(sql);

            ResultSet rs = pStmt.executeQuery();

            while (rs.next()) {
                int nomber = rs.getInt("NOMBER");
                String productName = rs.getString("PRODUCT_NAME");
                String comment = rs.getString("COMMENT");
                Date posted = rs.getDate("POSTED");
                Review review = new Review(nomber, productName, comment, posted);
                reviewList.add(review);
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
        return reviewList;
    }

    public List<Review> findOne(int productnomber) {
        Connection conn = null;
        List<Review> reviewList = new ArrayList<Review>();
        try {
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
            String sql = "SELECT NOMBER,PRODUCT_NAME,COMMENT,POSTED FROM REVIEW ORDER BY NOMBER DESC";
            PreparedStatement pStmt = conn.prepareStatement(sql);

            ResultSet rs = pStmt.executeQuery();

            while (rs.next()) {
                int nomber = rs.getInt("NOMBER");
                if (nomber != productnomber) {
                    continue;
                } else {
                    String productName = rs.getString("PRODUCT_NAME");
                    String comment = rs.getString("COMMENT");
                    Date posted = rs.getDate("POSTED");
                    Review review = new Review(nomber, productName, comment, posted);
                    reviewList.add(review);
                }
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
        return reviewList;
    }

    public boolean create(Review review) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

            String sql = "INSERT INTO REVIEW(NOMBER,PRODUCT_NAME,COMMENT) VALUES(?,?,?)";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setInt(1, review.getNomber());
            pStmt.setString(2, review.getProductName());
            pStmt.setString(3, review.getComment());

            int result = pStmt.executeUpdate();
            if (result != 1) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }
}

