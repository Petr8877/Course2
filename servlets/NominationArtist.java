package kasper.classwork.voting.servlets;

import kasper.classwork.voting.Vault;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NominationArtist", urlPatterns = "/nom/art")
public class NominationArtist extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/xml; charset=UTF-8");
        String[] singers = {"Prodigy", "Bring_Me_The_Horizon", "Foo_Fighters", "Blink_182"};
        Vault.addFromMapArtistKey(singers);
        PrintWriter writer = resp.getWriter();
        int count = 1;
        for (String singer : singers) {
            writer.write("<p>" + count++ + ". " + singer + "</p>");
        }

    }
}