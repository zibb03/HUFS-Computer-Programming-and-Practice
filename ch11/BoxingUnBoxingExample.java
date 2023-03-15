public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Boxing 
        //Integer obj1 = new Integer(100);
        Integer obj1 = 100;
        Integer obj2 = 200; //자동 전환해줌
        Integer obj3 = Integer.valueOf("300");

        //Unboxing
        int value1 = obj1.intValue();
        int value2 = obj2;
        int value3 = obj3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
