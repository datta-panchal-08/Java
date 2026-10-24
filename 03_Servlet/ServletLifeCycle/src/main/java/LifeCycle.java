import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycle extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init() called - servlet initialized...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service() method called - Handling requests...");
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("<h2> Hello From Servlet LifeCycle");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called - servlet is destroyed successfully..");
    }
}
