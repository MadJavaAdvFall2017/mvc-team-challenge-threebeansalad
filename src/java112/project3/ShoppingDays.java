package java112.project3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * @author threebeansalad
 * class ShoppingDays
 *
 */
@WebServlet(
        name = "shoppingDays",
        urlPatterns = { "/shoppingDays" }
)

public class ShoppingDays extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2017);
        c.set(Calendar.MONTH, 11); // 11 = december
        c.set(Calendar.DAY_OF_MONTH, 25);

        Date xmas = c.getTime();
        Date today = new Date();
        long diff = xmas.getTime() - today.getTime();
        diff = diff / (1000L*60L*60L*24L);


        request.setAttribute("shoppingDays", diff  );

        String url = "/giftList.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}