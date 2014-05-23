package jp.co.jjs.java_seminar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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

        String name = (String) request.getParameter("name");
        String nickname = (String) request.getParameter("nickname");
        String address = (String) request.getParameter("address");
        String password = (String) request.getParameter("password");
        String forword = "/WEB-INF/JSP/InputData.jsp";

        HttpSession session = request.getSession();

        session.setAttribute("name", name);
        session.setAttribute("nickname", nickname);
        session.setAttribute("address", address);
        session.setAttribute("password", password);

        if (name != null) {
            forword = "/WEB-INF/JSP/authenticate.jsp";
        }

        session.setAttribute("forword", forword);

        ServletContext context = this.getServletContext();
        RequestDispatcher dispatchar = context.getRequestDispatcher(forword);
        dispatchar.forward(request, response);
    }
}
