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
 * Servlet implementation class RandomButton
 */
@WebServlet("/RandomButton")
public class RandomButton extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static RandomNumberData x = new RandomNumberData();
	private static ArrayList<Integer> RandomArray = x.getRA();
    private static int[] KisyutsuArray = x.getKA();
	private static int i = 0;
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

        PrintWriter out = response.getWriter();//[6]
        out.println("<html><head></head><body>");//[7]

        KisyutsuArray[i] = RandomArray.get(i);
        x.setKA(KisyutsuArray);
        i += 1;
        x.setK(i);
        out.println("</body></html>");
	    String url = "/Bingo_Kitayama/RandomNumber.jsp";
	    response.sendRedirect(url);
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
