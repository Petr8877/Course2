package kasper.classwork.voting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "Ress", urlPatterns = "/result")
public class Ress extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        HashMap<String, Integer> set = Vault.getArtist();
        for (Map.Entry entry : set.entrySet()){
            writer.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
    }
}