// Toki Young
import java.util.Scanner;

public class GameControl {
    // Fields and Properties==============================
    Player player;

    Wumpus wumpus;
    Cave cave;
    Hazards hazards;
    Scanner scanner;
    GameLocation gameLocation;
    // Constructors=========================
    public GameControl() {
        this.scanner = new Scanner(System.in);
        this.player = new Player("");
        this.wumpus = new Wumpus();
        this.hazards = new Hazards();
        this.cave = Cave();
        
    }

    // Methods===============================
    public void startGame(6) {
        cave.makeArray();

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
        if(gameControl.playerPosition == gameLocation.hazardLocation)
        return true;
    }
}
