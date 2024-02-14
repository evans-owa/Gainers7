import java.util.Scanner;

public class MeF8 {
    public static void main(String[] args) {
        // if else statement for finding the odd number and even number
        System.out.println("Enter the number: ");
        Scanner g3 = new Scanner(System.in);

        if( (g3.nextInt() % 2) == 0 ){
            System.out.println("is even");
        }
        else {
            System.out.println("is odd");
        }
    }
}
