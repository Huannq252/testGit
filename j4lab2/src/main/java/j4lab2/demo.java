package j4lab2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class demo
 */
@WebServlet({"/tamgiac","/dientich","/chuvi"})
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/tamgiac.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		double a = Double.parseDouble(req.getParameter("a"));
		double b = Double.parseDouble(req.getParameter("b"));
		double c = Double.parseDouble(req.getParameter("c"));
		if( ((a + b) > c) && ((a + c) > b) && ((b + c) > a) ) {
			double chuVi = (a + b + c);
			String uri = req.getRequestURI();
			if(uri.contains("dien-tich")) { 
				double dienTich = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a))/4;
				req.setAttribute("message", "Diện tích của tam giác là " + dienTich);
			}
			else{ 
			req.setAttribute("message", "Chu vi của tam giác là " + chuVi);
			}
		}
		else {
		req.setAttribute("message",
		"Không thỏa mãn các cạnh của một tam giác!");
		}
		req.getRequestDispatcher("/views/tamgiac.jsp").forward(req, resp);
			
	}

	
}
