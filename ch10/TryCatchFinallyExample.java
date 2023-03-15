public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");            
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            //e.printStackTrace();
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}

//public static void f() throws NullPointerException