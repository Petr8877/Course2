package kasper.classwork.voting.objects;

public class Artist {

    private String name;
    private int vote;

    public Artist(String name, int vote) {
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
