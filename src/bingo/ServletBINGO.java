package bingo;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ServletBINGO
 */
@WebServlet("/ServletBINGO")
public class ServletBINGO extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Integer> CheckHit = new ArrayList<Integer>();
	private static ArrayList<Integer> HittedNumber = new ArrayList<Integer>();
	private static boolean BL = false;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBINGO() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html; charset=UTF-8");//[4]
        String[] RandomNumber = request.getParameterValues("button");//[5]
        PrintWriter out = response.getWriter();//[6]

        out.println("<html><head></head><body>");//[7]
        out.print("<p>あなたの選んだナンバーは");//[8]
        for (String RN : RandomNumber) {//[9]
            out.print("[" + RN + "]");//[9]
        }//[10]
        out.println("です。</p>");//[11]

        out.println("今までに出た数字は");
        for(int x : RandomButton.getKA()) {
        CheckHit.add(x);
        out.print(x + ",");
        }
        out.println("です。");

        Integer RandomNumberInteger = Integer.parseInt(RandomNumber[0]);
        out.println("当たっていたら当たりと出ます。");
        if(CheckHit.contains(RandomNumberInteger)){
        	BL = true;
        	HittedNumber.add(RandomNumberInteger);
        	out.println("当たり！！！");
        }else{
        	out.println("はずれ！！！");
        }

        out.print("今までに当たったあなたの番号は");
        if(HittedNumber.contains(RandomNumberInteger)) {
        out.print(HittedNumber);
        }
        out.println("</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("サーブレットが呼ばれました");
		doGet(request, response);
	}



	boolean ReturnBL() {
		return BL;
	}
}



