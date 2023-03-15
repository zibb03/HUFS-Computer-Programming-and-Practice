public class ThrowsExample {
    //public static void main(String[] args) throws ClassNotFoundException{
    public static void main(String[] args){
        // try {
        //     findClass();
        // } catch(ClassNotFoundException e) {
        //     System.out.println("클래스가 존재하지 않습니다.");
        // }

        //findClass();

        // try {
        //     findClass();
        // } catch(ClassNotFoundException e) {
        //     System.out.println("클래스가 존재하지 않습니다.");
        // } catch (Exception e) {

        // }

        //catch는 하위 클래스부터 상위 클래스 순서로 적어야 함(상위 클래스가 위에 오면 나머지 코드는 의미가 없어져서..)
        // try {
        //     findClass();
        // } catch (Exception e) {

        // } catch(ClassNotFoundException e) {
        //     System.out.println("클래스가 존재하지 않습니다.");
        // } 
    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}

