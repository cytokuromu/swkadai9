package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import model.GetProductListLogic;
import model.GetReviewListLogic;
import model.Product;
import model.Review;

/**
 * Servlet implementation class ReviewServlet
 */
@WebServlet("/ReviewServlet")
public class ReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
        int productnomber = Integer.parseInt(request.getParameter("productnomber"));
        String productname = request.getParameter("productname");
        //processRequest(request, response);
        GetReviewListLogic getMutterListLogic = new GetReviewListLogic();
        List<Review> reviewList = getMutterListLogic.execute(productnomber);
        request.setAttribute("reviewList", reviewList);
        GetProductListLogic getProductListLogic = new GetProductListLogic();
        List<Product> productList = getProductListLogic.execute();
        request.setAttribute("productList", productList);
        request.setAttribute("productnomber", productnomber);
        request.setAttribute("productname", productname);
        //HttpSession session = request.getSession();
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/review.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
