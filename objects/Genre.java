package kasper.classwork.voting.objects;

public class Genre {

    private String name;
    private int vote;

    public Genre(String name, int vote) {
        this.name = name;
        this.vote = vote;
    }

    public int getVote() {
        return vote;
    }

    @Override
    public String toString() {
        return name + ", vote = " + vote;
    }
}
