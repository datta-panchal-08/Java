import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name  = req.getParameter("name");
        String email = req.getParameter("email");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();
        session.setAttribute("UserName",name);
        session.setAttribute("UserEmail",email);

        String encodeName = URLEncoder.encode(name, StandardCharsets.UTF_8);

        Cookie cookie = new Cookie("name",encodeName);
        cookie.setMaxAge(60*60); // 1h
        resp.addCookie(cookie);
        resp.sendRedirect("welcome");
    }
}
