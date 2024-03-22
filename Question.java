public class Question {

    private String question = " whats your favorite color ";
    private String answer = " blue ";
    private String wrongA = " pink";
    private String wrongB = " orange";
    private String wrongC = " red";
    
    public Question(String q, String a){
        this.question = q; 
        this.answer = a;
    }

    public String showQuestion(){
        System.out.println(question);
    }

    public String aviableAnswer(){

        System.out.println(wrongA);
        System.out.println(wrongB);
        System.out.println(wrongC);
    }

    public String getPossibleAnswers(){
        return this.wrongA + " ," + this.wrongB + " ," + this.wrongC + " ," + this.answer;
    }
    
    public String getQuestion(){

        return this.question;
    }

    public boolean checkAnswer(String a){
        if(a.equals(this.answer)) return true;
        return false;
    }
}
