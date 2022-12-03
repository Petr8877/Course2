package kasper.classwork.voting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NominationGenre", urlPatterns = "/nom/genre")
public class NominationGenre extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        PrintWriter writer = resp.getWriter();
        writer.write("Genre_1"+ "\n");
        writer.write("Genre_2"+ "\n");
        writer.write("Genre_3"+ "\n");
        writer.write("Genre_4"+ "\n");
        writer.write("Genre_5"+ "\n");
        writer.write("Genre_6"+ "\n");
        writer.write("Genre_7"+ "\n");
        writer.write("Genre_8"+ "\n");
        writer.write("Genre_9"+ "\n");
        writer.write("Genre_10"+ "\n");
    }
}