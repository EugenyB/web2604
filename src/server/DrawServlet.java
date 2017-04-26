package server;

import model.Tabul;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by eugen on 26.04.2017.
 */
@WebServlet(name = "DrawServlet", urlPatterns = {"*.html"})
public class DrawServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double start = Double.parseDouble(request.getParameter("start"));
        double finish = Double.parseDouble(request.getParameter("finish"));
        double step = Double.parseDouble(request.getParameter("step"));
        request.setAttribute("points", new Tabul(start,finish,step).getPoints());
        request.getRequestDispatcher("/draw.jsp").forward(request,response);
    }
}
