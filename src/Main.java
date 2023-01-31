import java.util.*;

/* A number is called a sunny number if the number next to the given number is a perfect square.
   In other words, a number N will be a sunny number if N+1 is a perfect square.
*/

public class Main {
    public static boolean isSunnyNumber(int number){
        return Math.sqrt(number + 1) % 1 == 0;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit: ");
        int lowerLimit = sc.nextInt();

        System.out.print("Enter upper limit: ");
        int upperLimit = sc.nextInt();

        System.out.println("The Sunny numbers from " + lowerLimit + " to " + upperLimit + " are:\n");

        for(int i=lowerLimit; i<=upperLimit; i++){
            if(isSunnyNumber(i))
                System.out.print(i + "  ");
        }
    }
}