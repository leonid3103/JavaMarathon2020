package day12.task4;


import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("Green day", 1987, new ArrayList(Arrays.asList("john", "james", "jack")));
        MusicBand band2 = new MusicBand("Coldplay", 1996, new ArrayList(Arrays.asList("adam", "alex","artur")));
        MusicBand.transferMembers(band1,band2);
        MusicBand.printMembers(band1);
        MusicBand.printMembers(band2);
    }
}
