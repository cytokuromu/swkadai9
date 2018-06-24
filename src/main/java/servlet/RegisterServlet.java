package servlet;

import java.io.IOException;
//import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import model.GetMemberListLogic;
import model.Member;
import model.PostMemberLogic;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/register.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
        //Integer nomber=Integer.parseInt(request.getParameter("nomber"));
        String name = request.getParameter("name");
        String Id = request.getParameter("Id");
        String phone = request.getParameter("phone");
        String mail = request.getParameter("mail");
        String pass = request.getParameter("pass");
        String address = request.getParameter("address");

        //HttpSession session = request.getSession();
        // 入力値チェック
        if (name != null && name.length() != 0 && Id != null && Id.length() != 0 && phone != null && phone.length() != 0 && mail != null && mail.length() != 0
                && pass != null && pass.length() != 0 && address != null && address.length() != 0) {

            HttpSession session = request.getSession();

            Member member = new Member(name, Id, phone, mail, pass, address);

            session.setAttribute("member", member);
            PostMemberLogic postMemberLogic = new PostMemberLogic();
            postMemberLogic.execute(member);

        } else {
            //エラーメッセージをリクエストスコープに保存
            request.setAttribute("errorMsg", "全ての項目を埋めてください");
            RequestDispatcher dispatcher
                    = request.getRequestDispatcher("/WEB-INF/jsp/register.jsp");

            dispatcher.forward(request, response);
        }
        //GetMemberListLogic getMemberListLogic = new GetMemberListLogic();
        //List<Member> memberList = getMemberListLogic.execute();
        //request.setAttribute("memberwList", memberList);
        request.setAttribute("Id", Id);
        // メイン画面にフォワード
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/registerOK.jsp");

        dispatcher.forward(request, response);
	}

}
