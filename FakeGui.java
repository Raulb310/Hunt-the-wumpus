import java.util.Scanner;
public class FakeGui {
    private Scanner sc;

    public FakeGui(){
        sc = new Scanner(System.in);

    }
    public int[] getPosition(){
        System.out.println("Next move...");
        int[] positions = new int[2];
        positions[0] = sc.nextInt();
        positions[1] = sc.nextInt();
        return positions;
    }

    public void invalid(String x) {
        System.out.println(x);
    }
    public void setInfo(String[] details){
        // sets the new info with the provided stuff
    }
}
