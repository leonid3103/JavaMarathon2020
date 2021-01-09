package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> mus1 = new ArrayList(Arrays.asList(new MusicArtist("john", 1960),
                new MusicArtist("james", 1961),
                new MusicArtist("jack", 1962)));
        List<MusicArtist> mus2 = new ArrayList(Arrays.asList(new MusicArtist("adam", 1960),
                new MusicArtist("alex", 1961),
                new MusicArtist("artur", 1962)));
        MusicBand bnd1 = new MusicBand("Owl City", 2007, mus1);
        MusicBand bnd2 = new MusicBand("Fall Out Boy", 2001, mus2);
        MusicBand.transferMembers(bnd1,bnd2);
        MusicBand.printMembers(bnd1);
        MusicBand.printMembers(bnd2);
    }
}
