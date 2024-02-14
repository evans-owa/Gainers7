 public class MeF3 {
    public static void main(String[] args) {
//        Conditional operation if the name exit print if it does not print a message
        String school = "Vanse academy";

        System.out.println(school.isEmpty() ? "The name is not valid": school); // Vanse academy

//        example two
        String academy = "";

        System.out.println(academy.isEmpty() ? "The name is not valid": academy); // The name is not valid

//        negation example (not operator) for empty
        System.out.println( !academy.isEmpty() ? academy : "this is not a proper name");

//    negation example (not operator) for complete string
        System.out.println(!school.isEmpty() ? school: "you got a be kidding me have added");

    }
}
