package kasper.classwork.voting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class AboutMe {

    private String aboutMe;
    private LocalDateTime date;

    public AboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
        date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "AboutMe{" +
                "aboutMe='" + aboutMe + '\'' +
                ", date=" + date +
                '}';
    }
}
