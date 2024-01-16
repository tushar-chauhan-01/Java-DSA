public class typeCast {
    public static void main(String[] args) {
        // Implict type cast ( smaller to bigger memory )
        int currentYear = 2024;
        float age = 39.5f;

        //int birthYear = currentYear - age; Not valid
        float birthYear = currentYear - age;
        System.out.println("birthYear -> "+ birthYear);
        double birthYear1 = currentYear - age;
        System.out.println("birthYear -> "+ birthYear1);

        /*
        Explict type cast
        Normall java wont allow you to use lesser memory datatype automatically but if you know output 
        can come in lesser memory datatype then we have to Explictly mention that.
        */
        short currentYear1 = 2024;
        byte age1 = 39;

        short birthYear2 = (short)(currentYear1 - age1);
        System.out.println("birthYear -> "+ birthYear2);

        double doubleValue = 9.85;
        // Type casting from double to int
        int result = (int) (doubleValue);
        System.out.println(result);
    }
}
