public class Methods {
    // To invoke/call any method , we need to put it inside main method because main
    // method is always
    // executed inside a class.
    public static void printDetails() {
        System.out.println("This is a *printDetails* method.");
    }

    // Method with input/arguments
    public static void intro(String name, int age) {
        System.out.println("This is " + name + " and I am years " + age + " old.");
    }

    // return type method
    public static int squaredNumber(int number) {
        int square = number * number;
        return square;
    }

    public static void main(String[] args) {
        
        printDetails();

        intro("John Doe", 21);

        int sq = squaredNumber(7);

        System.out.println("The square of provided number is " + sq);
    }
}
