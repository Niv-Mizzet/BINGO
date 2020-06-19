package bingo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectTest3
 */
@WebServlet("/RedirectTest3")
public class RedirectTest3 extends HttpServlet {
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws IOException, ServletException{

			    response.setContentType("text/html; charset=UTF-8");
			    PrintWriter out = response.getWriter();

			    log("アクセスされました");

			    String url = "/Bingo_Kitayama/JSPBingo.jsp";
			    response.sendRedirect(url);
			  }
			}
