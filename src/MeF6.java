import java.util.Scanner;

public class MeF6 {
    public static void main(String[] args) {
        System.out.print("Enter an Integer: ");
//            write a program that reads  a number and determines if the number is odd of even
        Scanner number = new Scanner(System.in);
        int me1 = number.nextInt();

        if (me1 % 2 == 0){
            System.out.println(me1 + " the number even");
        }


//        if (me1 % 2 == 1){
//            System.out.println( me1 + " the number is odd");
//        }

//                  OR

//        negate usage for
        if ( !(me1 % 2 == 0) ){
            System.out.println( me1 + " the number is odd");
        }
    }
}
