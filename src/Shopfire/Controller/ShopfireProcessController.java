package Shopfire.Controller;

import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ShopfireProcessController
 */
@WebServlet(description = "process the cart transaction", urlPatterns = { "/processtransac.action" })
public class ShopfireProcessController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		try {
//			ShopfireBean bean = new ShopfireBean("creditCardNumber");
			
		
//			bean.process();
		
//		} catch (InvalidCardException ice){
//			ice.getMessage();
//			response.sendRedirect("cartError.jsp");
//		} catch(SQLException sqle) {
//			sqle.getMessage();
//			response.sendRedirect("error.jsp?errCode=1");
//		} catch(Exception e){
//			System.out.println("Something went wrong");
//			e.getMessage()
//		}
	}

}
