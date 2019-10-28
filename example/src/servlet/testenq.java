package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testenq
 */
@WebServlet("/testenq")
public class testenq extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String detailQus = request.getParameter("body");

		String detailQtype;

		if (qtype.equals("company")) {
			detailQtype = "会社について";
		} else if (qtype.equals("product")) {
			detailQtype = "製品について";
		} else {
			detailQtype = "アフターサポートについて";
		}

		String msg1 = name +"さんの質問タイプは" + detailQtype +"です。";
		String msg2 = "下記は質問の詳細です。";

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=UTF-8>");
		out.println("<title>ユーザ質問内容</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg1 + "</p>");
		out.println("<p>" + msg2 + "</p>");
		out.println("<p>" + detailQus + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
