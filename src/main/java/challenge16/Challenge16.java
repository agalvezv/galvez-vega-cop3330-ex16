package challenge16;
//AGV
//6-5-2021
import java.util.Scanner;

public class Challenge16 {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("What is your age?");
        String givenAgeS = inputs.nextLine();
        int giveAgeI = Integer.parseInt(givenAgeS);
        String responseOne = "You are not old enough to legally drive.";
        String responseTwo = "You are old enough to legally drive.";

        String outcome = (giveAgeI >= 16) ? responseTwo : responseOne;
        System.out.println(outcome);


    }

}
