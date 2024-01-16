public class operatorSession {
    public static void main(String[] args) {
        
        // assignment operators
        int i=10;
        int j=i;
        int k=i=100;
        System.out.println("i -> " + i);
        System.out.println("j -> " + j);
        System.out.println("k -> " + k);

        // arithmatic operators ( +, -, *, %, / )
        System.out.println("101 + 20 -> " + (101+20));// add
        System.out.println("101 - 20 -> " + (101-20));// subtract
        System.out.println("101 / 20 -> " + (101/20));// divide or quotient
        System.out.println("101 * 20 -> " + (101*20));// multiple
        System.out.println("101 % 20 -> " + (101%20));// remainder

        // augmented opertor
        int num = 3;
        System.out.println("num -> "+ num);
        num = num + 3;
        System.out.println("num -> "+ num);
        num += 3;
        System.out.println("num -> "+ num);

    }
}
