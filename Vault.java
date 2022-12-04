package kasper.classwork.voting;

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

    public static void addFromMapArtist(String str){
        if (artist.containsKey(str)){
            artist.put(str, artist.get(str) + 1);
        }
    }

    public static void addFromMapArtistKey(String[] arr){
        for (String s : arr) {
            artist.put(s, 0);
        }
    }

    public static void addFromGenreKey(String[] arr){
        for (String s : arr) {
            genre.put(s, 0);
        }
    }

    public static void addFromGenreValue(String[] arr){
        for (String s : arr) {
            if (genre.containsKey(s)) {
                genre.put(s, genre.get(s) + 1);
            }
        }
    }

    public static void aboutMe(String str){
        person.add(new AboutMe(str));
    }

    public static List toListSinner() {
        List<String> lst = new ArrayList<>();
        Iterator it = artist.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            lst.add(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
        return lst;
    }

    public static Vault getVault(){
        if (vault == null){
            vault = new Vault();
        }
            return vault;
    }
}
