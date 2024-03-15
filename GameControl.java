// Toki Young
import java.util.Scanner;

public class GameControl {
    // Fields and Properties==============================
    Player p;

    Wumpus w;
    Cave c;
    Pit pit;
    Scanner sc;
    // Constructors=========================
    public GameControl() {
        this.p = new Player("");
    }

    // Methods===============================
    public void startGame() {

    }

    public int[] checkOpenings(Player p) {
        int[] i = new int[0];
        return i;
    }

    public boolean closeToHazard(Player p) {
        return true;
    }

    public boolean move(Cave c) {
        return true;
    }

    public boolean checkSameCaveAsWumpus(Player p, Wumpus w) {
        return true;
    }

    public boolean startTrivia(){
        return true;
    }
    public void teleportPlayer() {

    }

    public boolean checkSameCaveAsPit(Player p, Pit pit) {
        return true;
    }
}
