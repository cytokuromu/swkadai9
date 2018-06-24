package model;

import java.util.List;
import dao.ProductDAO;

public class GetProductListLogic {
	public List<Product> execute() {
        ProductDAO dao = new ProductDAO();
        List<Product> productList = dao.findAll();
        return productList;
    }
}
