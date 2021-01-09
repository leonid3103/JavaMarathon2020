package day12.task4;

import day12.task5.MusicArtist;

import java.util.List;

public class MusicBand {
    private String nameGroup;
    private int year;
    private List<String> members;

    public MusicBand(String nameGroup, int year, List<String> member) {
        this.nameGroup = nameGroup;
        this.year = year;
        this.members = member;
    }

    public static void printMembers(MusicBand band1) {
        System.out.println(band1);
    }

    public List<String> getMember() { ;
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

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static MusicBand transferMembers(MusicBand band1, MusicBand band2) {
             band2.members.addAll(band1.members);
             band1.members.clear();
             return band2;
        }

    }
