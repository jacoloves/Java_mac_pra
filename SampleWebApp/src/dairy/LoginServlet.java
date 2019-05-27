package dairy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DTO.LoginDto;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		RequestDispatcher dispatcher = request.getRequestDispatcher("/dairy_main/loginOK.jsp");
		dispatcher.forward(request, response);
		*/
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");

		Login login = new Login(userId, pass);
		LoginDto ldto = new LoginDto();
		boolean result = ldto.execute(login);

		if (result ) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/dairy_main/loginOK.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/LoginServlet");
		}

	}

}
