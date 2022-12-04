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

@WebServlet(name = "Ress", urlPatterns = "/result")
public class Ress extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        HashMap<String, Integer> artist = Vault.getArtist();
        for (Map.Entry entry : artist.entrySet()){
            writer.write("<p>" + entry.getKey() + " " + entry.getValue() + "</p>");
        }

        writer.write(Vault.toListSinner().toString());

        HashMap<String, Integer> genres = Vault.getGenre();
        for (Map.Entry entry : genres.entrySet()){
            writer.write("<p>" + entry.getKey() + " " + entry.getValue() + "</p>");
        }
    }
}