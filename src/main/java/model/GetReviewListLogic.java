package model;

import java.util.List;
import dao.ReviewDAO;

public class GetReviewListLogic {
	public List<Review> execute(int productnomber) {
        ReviewDAO dao = new ReviewDAO();
        List<Review> reviewList = dao.findOne(productnomber);
        return reviewList;
    }
    
    public List<Review> execute() {
        ReviewDAO dao = new ReviewDAO();
        List<Review> reviewList = dao.findAll();
        return reviewList;
    }
}
