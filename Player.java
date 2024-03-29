// Toki Y  v oung
// Period 6
// Team BeanRice


public class Player {
    private String name;
    int position[];
    int health;
    
    public Player(String n) {
        setName(n);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int value){
        this.health = value;
    }

    public void setPosition(int[] newPositions) {
        this.position[0] = newPositions[0];
        this.position[1] = newPositions[1];
    }
}
