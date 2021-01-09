package day12.task5;

import java.util.List;

public class MusicBand {
    private String nameGroup;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String nameGroup, int year, List<MusicArtist> member) {
        this.nameGroup = nameGroup;
        this.year = year;
        this.members = member;
    }

    public List<MusicArtist> getMember() { ;
        return members;
    }

    @Override
    public String toString() {
        return  "nameGroup = " + nameGroup +
                ", year = " + year +
                ", members = " + members +
                '}';
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public int getYear() {
        return year;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }
    public static void printMembers(MusicBand band) {
        System.out.println(band);
    }
    public static MusicBand transferMembers(MusicBand band1, MusicBand band2) {
             band2.members.addAll(band1.members);
             band1.members.clear();
             return band2;
        }

    }
