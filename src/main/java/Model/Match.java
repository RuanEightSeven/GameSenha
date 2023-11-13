package Model;

import java.util.ArrayList;
import java.util.List;

public class Match {

    private List<Round> rounds = new ArrayList<>();

    private Players p1;

    private Players p2;

    public Match(){

    }

    public Match(Players p1, Players p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}
