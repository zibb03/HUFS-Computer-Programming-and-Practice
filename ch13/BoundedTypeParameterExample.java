package ch13;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        //String str = Util.compare("a", "b");
        
        int result1 = Util.compare(10, 20);
        System.out.println(result1);

        int result2 = Util.compare(3.5, 24);
        System.out.println(result2);
    }
}
