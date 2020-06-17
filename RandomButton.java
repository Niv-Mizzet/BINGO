package bingo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandomButton
 */
@WebServlet("/RandomButton")
public class RandomButton extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Integer> RandomArray = new ArrayList<Integer>();
    private static int[] KisyutsuArray = new int[75];
	static int i = 0;
	static {
	for(int i = 1 ; i <= 75 ; i++) {
	    RandomArray.add(i);
	}
	Collections.shuffle(RandomArray);
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomButton() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html; charset=UTF-8");//[4]
        String[] checkedFruits = request.getParameterValues("button");//[5]
        PrintWriter out = response.getWriter();//[6]
        out.println("<html><head></head><body>");//[7]
        out.print("<p>あなたの選んだナンバーは");//[8]
        for (String fruit : checkedFruits) {//[9]
            out.print("[" + fruit + "]");//[9]
        }//[10]
        out.println("です。</p>");//[11]
        out.println("ランダムな数字は");
        out.println(RandomArray.get(i++));
        KisyutsuArray[--i] = RandomArray.get(i);
        i += 1;
        out.println("今までに出た数字は");
        for(int x : KisyutsuArray) {
        out.println(x + ",");
        }
        out.println("</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
