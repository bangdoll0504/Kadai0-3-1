package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beansdomain.Customer;

@WebServlet("/CuserReferServlet")
public class CuserReferServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		perform(request,response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		perform(request,response);
	}
	public void perform(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
		//ブラウザに入力された商品ID取得
		String inputcuserid = request.getParameter("cuserid");

		//Shohinドメインクラスをインスタンス化
		Customer cuserbeans = null;
		try {
			//コンストラクタに入力された商品IDを渡して実行。これで、shohinbeansに検索結果が入っている
			cuserbeans = new Customer(inputcuserid);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		//商品情報を格納するセッションを生成
		HttpSession sessionshohin = request.getSession(true);

		//そのセッションに商品情報のオブジェクトを格納
		sessionshohin.setAttribute("Customer",cuserbeans);

		if(cuserbeans.isExist()){
			//検索した商品IDに対する商品名が存在するなら、商品表示ページへ
			request.getRequestDispatcher("/cuserresult.jsp").forward(request,response);
	    }else{
	    	//存在しないなら、検索画面へ
	    	request.getRequestDispatcher("/cuserrefer.jsp").forward(request,response);
	    }
	}
}


