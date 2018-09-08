package no.hib.dat152;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Store")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	List<Product> products = null;
    
    public StoreServlet() {
        super();
    }
    
    public static String sortCookies(Cookie[] cookies){
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("locale")) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}
    
    public void productFactory() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String cookieValue = sortCookies(request.getCookies());
		
		
		request.setAttribute("products", products);
		request.setAttribute("locale", cookieValue);

		request.getRequestDispatcher("store.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
