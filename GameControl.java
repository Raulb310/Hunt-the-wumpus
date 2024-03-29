// Toki Young
import java.util.Scanner;
import javax.swing.JFrame;


public class GameControl{
    // Fields and Properties==============================
    Player player;
    JFrame frame;
    Wumpus wumpus;
    Cave cave;
    Hazards hazards;
    Scanner scanner;
    GameLocation gameLocation;
    GUI gui;
    FakeGui fakegui;
    
    // Constructors=========================
    public GameControl() {
        this.scanner = new Scanner(System.in);
        this.player = new Player("");
        this.wumpus = new Wumpus();
        this.hazards = new Hazards();
        this.cave = new Cave();
        new FakeGui();
        
        while(true) {
        
            
            turn();
        }
        


        
    }

    // Methods===============================
    void turn(){
        int[] newPositions = fakegui.getPosition();
        // is move valid? whi knows that?
        if(cave.isValid(newPositions)){
            player.setPosition(newPositions);
            String[] details = cave.getDetails(newPositions);
            fakegui.setInfo(details);

        } else {
            fakegui.invalid("Invalid");
        }

    }

    public void startGame() {
        //cave.makeArray();
        


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
        //player.goTo(Math.random(), Math.random());
    }

    public boolean checkSameCaveAsPit(Player p, Pit pit) {
        if(gameLocation.playerLocation == gameLocation.hazardLocation) {
            return true;
        } else return true;

    }
}
