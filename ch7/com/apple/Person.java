package ch7.com.apple;

public class Person {
    // protected String field;

    // protected A() {

    // }

    // protected void method() {
        
    // }

    protected String name = "호호";

    protected Person() {

    }

    //프로그램 재정비(이름 바꾸기) >> 툴을 통해 하면 한번에 바뀜, 실수 없이 >> refactoring
    protected void eat() {
        System.out.println("OPPS");
    }
    
    protected void eat(int no) {
        System.out.println("eat" + no);
    }
}
