package servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GetProductListLogic;
import model.Product;

/**
 * Servlet implementation class Main
 */
@WebServlet(name="Main" , urlPatterns = {"/Main"})
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//GetProductListLogic getProductListLogic = new GetProductListLogic();
        HttpSession session = request.getSession();
        //List<Product> productList = getProductListLogic.execute();
        //session.setAttribute("productList", productList);
        int month=0;
        String goods="";
        int months[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        GregorianCalendar gcalendar = new GregorianCalendar();
        month=months[gcalendar.get(Calendar.MONTH)];
        switch(month){
            case 1:
                goods="チョコ";
                break;
            case 2:
                goods="ひな人形";
                break;
            case 3:
                goods="卵";
                break;
            case 4:
                goods="こいのぼり";
                break;
            case 5:
                goods="傘";
                break;
            case 6:
                goods="笹";
                break;
            case 7:
                goods="水着";
                break;
            case 8:
                goods="杖";
                break;
            case 9:
                goods="かぼちゃ";
                break;
            case 10:
                goods="コート";
                break;
            case 11:
                goods="クリスマスツリー";
                break;
            case 12:
                goods="熊手";
                break;              
        }
        session.setAttribute("month", month);
        session.setAttribute("goods", goods);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
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
