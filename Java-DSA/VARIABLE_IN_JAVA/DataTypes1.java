class DataTypes1 {
    public static void main(String[] args) {
        byte player = 11;
        short score = 123;
        int seatings = 6000;
        long fans = 12345674646L;
        float price1 = 45.756F; /*
        BY DEFAULT JAVA TAKE ALL DECIMAL NUMBER AS 'DOUBLE' THIS WILL TAKE MORE SPACE IN MEMORY.
        UPTO 5 DECIMAL PLACES WE CAN CONSIDER IT AS FLOAT , BEYOND THAT IT SHOULD BE DOUBLE.
        TO MAKE SURE YOU ARE STORINF IT IN FLOAT PUT 'F' AT END OF VALUE
        */ 
    
        double price2 = 45.7345676756456768756D;
        char name = 'A';
        char name1 = 65;
        boolean vote = false ;
        
        // Datatype classes
        Integer i =100;
        System.out.println(i);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Character j = 'B';
        System.out.println(j);
        //

        System.out.println("Player - "+ player);
        System.out.println("score - "+ score);
        System.out.println("seatings - "+ seatings);
        System.out.println("fans - "+ fans);
        System.out.println("price1 - "+ price1);
        System.out.println("price2 - "+ price2);
        System.out.println("name - "+ name);
        System.out.println("name1 - "+ name1);
        System.out.println("vote - "+ vote);
    }
}
