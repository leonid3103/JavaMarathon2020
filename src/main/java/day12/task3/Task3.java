package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> band = new ArrayList(Arrays.asList(
                (new MusicBand("Green day", 1987)),
                (new MusicBand("Coldplay", 1996)),
                (new MusicBand("LinkinPark", 1996)),
                (new MusicBand("Foo Fighters", 1994)),
                (new MusicBand("OneRepublic", 2002)),
                (new MusicBand("Daughtry", 2006)),
                (new MusicBand("Panic! at the Disco", 2004)),
                (new MusicBand("Paramore", 2004)),
                (new MusicBand("Owl City", 2007)),
                (new MusicBand("Fall Out Boy", 2001))));
        Collections.shuffle(band);
        System.out.println(band);
        System.out.println(groupsAfter2000(band));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bands1 = new ArrayList<>();
        for (MusicBand bn : bands) {
            if (bn.getYear() > 2000) {
                bands1.add(bn);
            }
        }
        return bands1;
    }
}