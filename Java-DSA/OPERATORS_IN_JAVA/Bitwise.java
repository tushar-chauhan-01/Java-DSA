public class Bitwise {
    public static void main(String[] args) {
        // Bitwise Shift Operator
        // left shift <<
        // signed right shift >>
        // unsigned right shift >>>
        // no left unsigned
        // lets try it on integer
        System.out.println( 4 << 1 );
        System.out.println( 4 >> 1 );
        System.out.println( 4 >>> 1 );
        System.out.println( -4 << 1 );
        System.out.println( -4 >> 1 );
        System.out.println( -4 >>> 1 );

        // Problems
        int x = 7;
        int y = 3;
        int result1 = x << y;
        int result2 = x >> y;
        int result3 = x >>> y;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
