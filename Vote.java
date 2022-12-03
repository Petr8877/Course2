package kasper.classwork.voting;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Vote", urlPatterns = "/voteAll")
public class Vote extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String artist = req.getParameter("art");
       // Enumeration<String> genres = req.getHeaderNames();
        Vault.addFromMapArtist(artist);

    }
    }