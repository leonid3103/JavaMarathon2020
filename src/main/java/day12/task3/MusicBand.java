package day12.task3;

public class MusicBand {
    private String nameGroup;
    private int year;

    public MusicBand(String nameGroup, int year) {
        this.nameGroup = nameGroup;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" + nameGroup +
                ", " + year +
                '}';
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public int getYear() {
        return year;
    }
}
