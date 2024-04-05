// Team Beanrice



class Main {
    public static void main(String[] args) {
        GameControl gc = new GameControl();
        gc.startGame();
        System.out.println("Thing works.");

        //Question q = new Question();
        //System.out.println(q.checkAnswer("red"));




        Question q2 = new Question("steves favorite color " , "green");
        System.out.println(q2.checkAnswer("green"));
        
    }
}
