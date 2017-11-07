package java112.project3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author threebeansalad
 * class GiftAttributes
 *
 */
@WebServlet(
        name = "giftAttributes",
        urlPatterns = { "/giftAttributes" }
)
public class GiftAttributes extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, GiftBean> giftList = new TreeMap<String, GiftBean>();

        giftList.put("1", new GiftBean (1, "Gwen", "banjo", 49.99, false));
        giftList.put("2", new GiftBean (2, "Elizabeth", "gloves", 29.99, false));
        giftList.put("3", new GiftBean (3, "Katie", "paints", 39.99, false));
        giftList.put("4", new GiftBean (4, "Martha", "slippers", 35.99, false));

        request.setAttribute("giftList", giftList  );

        String url = "/giftList.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}