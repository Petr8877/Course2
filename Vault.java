package kasper.classwork.voting;

import java.util.HashMap;
import java.util.Map;

public class Vault {

    private static Vault vault;
    private static HashMap<String, Integer> artist = new HashMap<>();
    private static Map genre;

    public static HashMap<String, Integer> getArtist() {
        return artist;
    }

    public static void addFromMapArtist(String str){
        if (artist.containsKey(str)){
            artist.put(str, artist.get(str) + 1);
        } else {
            artist.put(str, 1);
        }
    }

    public static Vault getVault(){
        if (vault == null){
            vault = new Vault();
        }
            return vault;
    }
}
