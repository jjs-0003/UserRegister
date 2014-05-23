package jp.co.jjs.java_seminar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class decision
 */
@WebServlet("/decision")
public class decision extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public decision() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String judge = (String) request.getParameter("submit");
        String forword = "/WEB-INF/JSP/InputData.jsp";

        if ("Ok".equals(judge)) {
            forword = "/WEB-INF/JSP/finish.jsp";
        } else {
            forword = "/WEB-INF/JSP/InputData.jsp";

        }

        ServletContext context = this.getServletContext();
        RequestDispatcher dispatchar = context.getRequestDispatcher(forword);
        dispatchar.forward(request, response);

    }
}
