/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author colby
 */
public class LoginServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String logout = request.getParameter("logout");
        String message = "";
        String loggedIn = (String) session.getAttribute("LoggedIn");
        
        if (logout != null) {
            loggedIn = null;
            message = "You have been logged out";
            request.setAttribute("message", message);
            session.invalidate();
        }
        
        if (loggedIn != null) {
            response.sendRedirect("home");
            return;
        }
        
        getServletContext()
                .getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        boolean validUser = false;
        String message = "";
        
        if (username == null || password == null || username.equals("") || password.equals("")) {
            message = "Please enter a username and password";
        }
    }
    
    
}
