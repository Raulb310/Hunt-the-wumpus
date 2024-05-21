import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Triva {
    
    boolean askQuestion = false;
    boolean[][] storQuestions;

    public Triva(){
    try{
       File f = new File("triva.csv"); 
       
       Scanner s = new Scanner(f);

       s.next();

   

       

       System.out.println(s.next());
    }catch(Exception e){
        System.out.println("i made a mistake");
    }


    }

    public boolean askQuestion(){
        return askQuestion;
        while( !askQuestion = true ){
            System.out.println("i asked a question");
        }
    }

    
}
