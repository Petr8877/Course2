package kasper.classwork.voting.comparators;

import kasper.classwork.voting.objects.AboutMe;

import java.util.Comparator;

public class AboutMeComparator implements Comparator<AboutMe> {
    @Override
    public int compare(AboutMe o1, AboutMe o2) {
        return o2.getDate().compareTo(o1.getDate());
    }
}
