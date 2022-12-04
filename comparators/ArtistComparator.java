package kasper.classwork.voting.comparators;

import kasper.classwork.voting.objects.Artist;

import java.util.Comparator;

public class ArtistComparator implements Comparator<Artist> {
    @Override
    public int compare(Artist o1, Artist o2) {
        return Integer.compare(o1.getVote(), o2.getVote());
    }
}
