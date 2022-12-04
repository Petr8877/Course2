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
        String[] genres = {"Horror", "Action", "Western", "Detective", "Drama", "Comedy", "Melodrama", "Musical", "Noir", "Tragedy"};
        Vault.addFromGenreKey(genres);
        PrintWriter writer = resp.getWriter();
        for (String genre : genres) {
            writer.write("<p>" + genre + "</p>");
        }
    }
}