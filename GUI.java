// Toki


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;


public class GUI {
    String[] things;
    String[][] hazardList = {
            {"x","x","x","x","x","x",},
            {"x","x","pit","x","x","x",},
            {"x","x","","wumpus","x","x",},
            {"x","x","x","x","x","x",},
            {"x","bat","x","x","x","x",},
        };
    

    public GUI(){
        
        JFrame frame = new JFrame();
        frame.setTitle("Hunt the Wumpus!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(275, 275);
        frame.setLayout(new GridLayout(5,6));

        for(int i = 0; i < 30; i++) {
            frame.add(new JButton("" + (i+1)));
        }

        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
