import java.util.Scanner;

public class MeF7 {
    public static void main(String[] args) {
//        if else statement
        System.out.print("Enter an  integer: ");

        Scanner vary = new Scanner(System.in);
        int g2 = vary.nextInt();

        if(g2 % 2 == 0){
            System.out.println(g2 + " is even");
        }
        else{
            System.out.println(g2 + " is odd");
        }
    }
}
