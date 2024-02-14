public class MeF4 {
    public static void main(String[] args) {

        //logical operators || && !

        boolean b1 = true;
        boolean b2 =false;

        boolean b3 = b2 || true; // true
        boolean b4 = b2 && b1; //false
        boolean b5 = !(b2 && b1); //true

        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
