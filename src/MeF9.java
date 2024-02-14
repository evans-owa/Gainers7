import java.util.Scanner;

public class MeF9 {
    public static void main(String[] args) {
        // nested if statement
        System.out.print("Enter a number: ");
        Scanner f9 = new Scanner(System.in);

        int me9 = f9.nextInt();

        if ( me9 > 10 ){
            System.out.println(me9 + " Greater than 10");
        }
       else if ( me9 == 10 ) {
            System.out.println(me9 + " number is equal to 10");
        }
        else {
            System.out.println( me9 + " number is less than 10");
        }

        //        OR
//        if (me9 > 10 )
//            System.out.println(" >10");
//        else
//            if (me9== 10)
//                System.out.println(" =10");
//            else
//                System.out.println("<10");

    }
}
