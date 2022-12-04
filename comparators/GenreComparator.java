package kasper.classwork.voting.comparators;

import kasper.classwork.voting.objects.Genre;

import java.util.Comparator;

public class GenreComparator implements Comparator<Genre> {
    @Override
    public int compare(Genre o1, Genre o2) {
        return Integer.compare(o1.getVote(), o2.getVote());
    }
}
