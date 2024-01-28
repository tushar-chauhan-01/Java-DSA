public class Overloading {

    public static void sum(int a, int b) {
        System.out.println("int + int -> "+ (a+b) );
    } // if we dont have int method and insert int value it will execute sum method which have datatype next to int or higher
    
    public static void sum(float a, float b) {
        System.out.println("float + float -> "+ (a+b) );
    }

    public static void sum(double a, double b) {
        System.out.println("double + double -> "+ (a+b) );
    }

    public static void sum(double a, int b) {
        System.out.println("double + int -> "+ (a+b) );
    }

    public static void main(String[] args) {
        sum(2,2);
        sum(2f,2f);
        sum(2.4,2.5);
        sum(2.5,4);
    }
}
