/**
 *
 * @author Sean Jeske
 */
package Java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainPageServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             String url = request.getRequestURI();
        request.setAttribute("errorMessage", "Logged out");
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
    }
}
