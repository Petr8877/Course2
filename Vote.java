package kasper.classwork.voting;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

@WebServlet(name = "Vote", urlPatterns = "/voteAll")
public class Vote extends HttpServlet {

    private static final String START_PARAM_GENRE = "genre_";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/xml; charset=UTF-8");
        String artist = req.getParameter("art");
        String[] genres = req.getParameterMap().get("genre");
        String aboutMe = req.getParameter("me");
        PrintWriter writer = resp.getWriter();

        if (genres.length < 3){
           writer.write("Минимальное количество выбранных жанров 3");
        }

        writer.write("Введите информацию о себе");

        Vault.aboutMe(aboutMe);
        Vault.addFromMapArtist(artist);
        Vault.addFromGenreValue(genres);
    }
}
