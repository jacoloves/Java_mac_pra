package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MusicChoice;
import model.musicLogic;

/**
 * Servlet implementation class musicChoiceSite
 */
@WebServlet("/musicChoiceSite")
public class musicChoiceSite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/musicChoice.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメータ取得
		String music = request.getParameter("music");
		String musicianName = request.getParameter("musician");
		String price = request.getParameter("price");
		String detail = request.getParameter("detail");

		//入力値をプロパティに設定
		MusicChoice mc = new MusicChoice();
		mc.setPrice(Integer.parseInt(price));
		mc.setMusicNumber(music);
		mc.setMusicianName(musicianName);
		mc.setMusicDetail(detail);

		//消費税10%を付与する
		musicLogic ml = new musicLogic();
		ml.execute(mc);

		//リクエストスコープに保存
		request.setAttribute("musicchoice", mc);

		//フォワード
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/musicChoiceResult.jsp");
		d.forward(request, response);
	}

}
