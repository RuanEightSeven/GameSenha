package Model;

public class Players {

    private String name;
    private String name2;
    private int points;

    public Players() {
    }

    public Players(String name, String name2) {
        this.name = name;
        this.name2 = name2;
        points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String toString(){
        return name + ", " + name2;
    }
}
