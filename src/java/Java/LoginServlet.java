package Java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Sean Jeske
 */
@WebServlet(name = "LogingServlet", urlPatterns = {"/LogingServlet"})
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
      getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(userName == null || userName.isEmpty() || password == null || password.isEmpty()){
            request.setAttribute("errorMessage", "Please enter both fields.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        UserServices us = new UserServices();
        boolean isValid = us.loging(userName, password);
        
        if(!isValid){
            request.setAttribute("errorMessage", "User name or Password is invalid!");
            request.setAttribute("userName", userName);
            request.setAttribute("password", password);
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
             return;
        }
        
        request.setAttribute("username", userName);
        getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
    }

}
