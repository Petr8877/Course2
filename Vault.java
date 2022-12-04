package kasper.classwork.voting;

import kasper.classwork.voting.comparators.AboutMeComparator;
import kasper.classwork.voting.comparators.ArtistComparator;
import kasper.classwork.voting.comparators.GenreComparator;
import kasper.classwork.voting.objects.AboutMe;
import kasper.classwork.voting.objects.Artist;
import kasper.classwork.voting.objects.Genre;

import java.util.*;

public class Vault {

    private static Vault vault;
    private static HashMap<String, Integer> artist = new HashMap<>();
    private static HashMap<String, Integer> genre = new HashMap<>();
    private static List<AboutMe> person = new ArrayList<>();


    public static HashMap<String, Integer> getGenre() {
        return genre;
    }

    public static HashMap<String, Integer> getArtist() {
        return artist;
    }

    public static void addFromMapArtist(String str) {
        if (artist.containsKey(str)) {
            artist.put(str, artist.get(str) + 1);
        }
    }

    public static void addFromMapArtistKey(String[] arr) {
        for (String s : arr) {
            artist.put(s, 0);
        }
    }

    public static void addFromGenreKey(String[] arr) {
        for (String s : arr) {
            genre.put(s, 0);
        }
    }

    public static void addFromGenreValue(String[] arr) {
        for (String s : arr) {
            if (genre.containsKey(s)) {
                genre.put(s, genre.get(s) + 1);
            }
        }
    }

    public static void aboutMe(String str) {
        person.add(new AboutMe(str));
    }

    public static List<Artist> sortArtist() {
        ArtistComparator comparator = new ArtistComparator();
        String[] array = artist.keySet().toArray(new String[0]);
        List<Artist> list = new ArrayList<>();
        for (String art : array) {
            list.add(new Artist(art, artist.get(art)));
        }
        list.sort(comparator);
        return list;
    }

    public static List<Genre> sortGenre() {
        GenreComparator comparator = new GenreComparator();
        String[] set = genre.keySet().toArray(new String[0]);
        List<Genre> list = new ArrayList<>();
        for (String gen : set) {
            list.add(new Genre(gen, genre.get(gen)));
        }
        list.sort(comparator);
        return list;
    }

    public static List<AboutMe> sortAboutMe() {
        AboutMeComparator comparator = new AboutMeComparator();
        List<AboutMe> list = new ArrayList<>(person);
        list.sort(comparator);
        return list;
    }

    public static Vault getVault() {
        if (vault == null) {
            vault = new Vault();
        }
        return vault;
    }
}
