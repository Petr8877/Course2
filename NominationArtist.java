package kasper.classwork.voting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "NominationArtist", urlPatterns = "/nom/art")
public class NominationArtist extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        String[] singers = {"Prodigy", "Bring_Me_The_Horizon", "Foo_Fighters", "Blink_182"};
        PrintWriter writer = resp.getWriter();
        int count = 1;
        for (String singer : singers) {
            writer.write(count++ + ". " + singer + "\n");
        }
    }
}