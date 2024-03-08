// Toki Young

public class GameControl {
    // Fields and Properties==============================
    Player p;
    Map m;
    Wumpus w;
    Cave c;
    Pit pit;
    
    // Constructors=========================
    public GameControl() {

    }

    // Methods===============================
    public void startGame() {

    }

    public int[] checkOpenings(Player p) {
        return -1;
    }

    public boolean closeToHazard(Player p, Map m) {
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
