import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String question = "Which is the most populous country in the world?";
        String ChoiceOne = "India";
        String Choicetwo ="United States of America" ;
        String Choicethree = "China";
        String Choicefour = "Bangladesh";

        String CorrectAnswer = Choicethree;

        System.out.println(question);

        System.out.println("Choose the correct option:" + ChoiceOne + ", " + Choicetwo + ", " + Choicethree +", " + Choicefour );

        Scanner scanner = new Scanner((System.in));
        String input = scanner.next();

        if(CorrectAnswer.equals(input)){
            System.out.println("Congratulations, you got the right answer ");
        }

        else {
            System.out.println("The option you have selected is wrong" );
        }









    }
}