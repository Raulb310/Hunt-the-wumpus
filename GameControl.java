// Toki Young
import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GameControl {
    // Fields and Properties==============================
    Player player;
    JFrame frame;
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
        this.cave = new Cave();
        

        
    }

    // Methods===============================
    public void startGame() {
        //cave.makeArray();
        this.frame = new JFrame();
       
        frame.setTitle("Hunt the Wumpus!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(275, 275);
        frame.setLayout(new GridLayout(3,3));


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
        if(gameLocation.playerLocation == gameLocation.hazardLocation) {
            return true;
        } else return true;

    }
}
