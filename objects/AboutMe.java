package kasper.classwork.voting.objects;

import java.time.LocalDateTime;

public class AboutMe {

    private final String aboutMe;
    private final LocalDateTime date;

    public AboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
        date = LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "aboutMe: " + aboutMe + '\'' +
                ", date=" + date;
    }
}
