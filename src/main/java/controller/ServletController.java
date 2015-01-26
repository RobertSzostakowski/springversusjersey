package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by robert.szostakowski on 2015-01-27.
 */
public class ServletController extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("Before displaying the website");
        RequestDispatcher view = request.getRequestDispatcher("/webapp/WEB-INF/pages/SamplePage.html");
        view.forward(request, response);

    }
}