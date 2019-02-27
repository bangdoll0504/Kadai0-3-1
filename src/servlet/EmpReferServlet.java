package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beansdomain.Employee;

@WebServlet("/EmpReferServlet")
public class EmpReferServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		perform(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		perform(request, response);
	}

	public void perform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ブラウザに入力された商品ID取得
		String inputemplid = request.getParameter("emplid");
		String inputemplpass = request.getParameter("emplpass");

		// Shohinドメインクラスをインスタンス化
		Employee emplbeans = null;
		try {
			// コンストラクタに入力された商品IDを渡して実行。これで、shohinbeansに検索結果が入っている
			emplbeans = new Employee(inputemplid, inputemplpass);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		// 商品情報を格納するセッションを生成
		HttpSession sessionemployee = request.getSession(true);

		// そのセッションに商品情報のオブジェクトを格納
		sessionemployee.setAttribute("Employee", emplbeans);

		if (emplbeans.isExist()) {
			// 検索した商品IDに対する商品名が存在するなら、商品表示ページへ
			request.getRequestDispatcher("/menu.jsp").forward(request, response);
		} else {
			// 存在しないなら、検索画面へ
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}
}
