package kasper.classwork.voting.servlets;

import kasper.classwork.voting.Vault;
import kasper.classwork.voting.objects.AboutMe;
import kasper.classwork.voting.objects.Artist;
import kasper.classwork.voting.objects.Genre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Result", urlPatterns = "/result2")
public class Result extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/xml; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        List<Artist> artistList = Vault.sortArtist();
        for (int i = artistList.size() - 1; i >= 0; i--) {
            writer.write("<p>" + artistList.get(i).toString() + "</p>");
        }

        List<Genre> genreList = Vault.sortGenre();
        for (int i = genreList.size() - 1; i >= 0; i--) {
            writer.write("<p>" + genreList.get(i).toString() + "</p>");
        }

        List<AboutMe> aboutMeList = Vault.sortAboutMe();
        for (int i = aboutMeList.size() - 1; i >= 0; i--) {
            writer.write("<p>" + aboutMeList.get(i).toString() + "</p>");
        }
    }
}