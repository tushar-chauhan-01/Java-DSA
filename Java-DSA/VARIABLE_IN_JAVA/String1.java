class String1 {
    public static void main(String[] args) {
        // String Datatype Class
        String name = "John Doe";
        // name is object of String datatype class
        System.out.println("name - " + name);

        char name1 = 'J';
        // name1 is variable of char datatype
        System.out.println("name1 - " + name1);
        
        // convert uper to lower case
        String upperName = "JOHN DOE";
        System.out.println("UPPER - " + upperName);
        String lowerName = upperName.toLowerCase();
        System.out.println("LOWER - " + lowerName);


        // Operators on string and char

        System.out.println(upperName+lowerName);
        System.out.println(name1+lowerName);
        char var = 'a';
        System.out.println(var+1);
        System.out.println((char)(var+1));
    }
}
