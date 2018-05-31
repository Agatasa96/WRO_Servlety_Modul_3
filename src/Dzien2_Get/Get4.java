package Dzien2_Get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get4")
public class Get4 extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String param = req.getParameter("page");
       int page = 0;
       try {
           page = Integer.parseInt(param);
       } catch (Exception ex) {
           resp.getWriter().append("<h1> Podałeś nieprawidłowe znaki w paramterach! </h1>");
       }

       String responseString = "Dzielniki liczby " + page + " to ";
       for(int i = 1 ; i <= page; i++) {
           if (page % i == 0) {
               responseString += i + " ";
           }
       }

       resp.getWriter().append("<h1>").append(responseString).append("</h1>");
   }
}