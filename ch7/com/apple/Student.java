package ch7.com.apple;

public class Student extends Person{
    String name = "하하"; //새로 생성됨, 변수는 Override와 상관 X

    @Override //Override 할 떄 이 코드 쓰면, 잘못 Override 했을 때 또는 Override 아닌 Overrode 했을 때 경고 뜸
    public void eat() {
        //System.out.println("B.method()");
        System.out.println("냠냠");
        // A a = new A();
        // a.field = "value";
        // a.method();
    }

    public void drink() {
        name = "홍길동"; //가까이 정의되어 있는 name을 가리킴 (Student의 name)
    }
    // public void drink(String name) {
    //     name = "홍길동"; //가까이 정의되어 있는 name을 가리킴 (인자 name)
    // }
    // public void drink(String name) {
    //     this.name = "홍길동"; //가까이 정의되어 있는 name을 가리킴 (Student의 name)
    // }
    // public void drink(String name) {
    //     super.name = "홍길동"; //가까이 정의되어 있는 name을 가리킴 (상위 클래스의 name)
    //     //super.super 허용 X
    // }
}

class Sample {
    /*
    public static void main(String[] args) {
        //Person(Interface) 철수 = new Student();
        //Interace는 복잡한 부분 감춤
        //외부에서 사용할 수 있는 객체가 그 객체의 인터페이스
        Student 철수 = new Student(); //이름 언어 상관 X
        //Student Type로 정의하면 method 3개 사용 가능, "하하" 로 출력
        //Person Type는 불가, method 2개 사용 가능, "호호"로 출력

        철수.eat();

        // Student obj2 = (Student)new Person(); //강제 형변횐
        // obj2.eat(); //thread에서 오류 발생

        //차례대로 가져오는 것 - 순차적
        //동시에 가져오는 것 - 병렬적
        //병렬적으로 처리하면 사용자 경험이 좋아짐 >> User eXperience
        //하나의 프로그램 내에서 병렬적으로 일을 시킬 떄 사용하는 것 - Thread
        //JAVA 프로그램 실행하면 Process가 만들어지고 Thread 생성
        //가장 처음 실행되는 Thread - MainThread

        //Exception in thread "main" java.lang.ClassCastException: 
        //class ch7.com.apple.Person cannot be cast to 
        //class ch7.com.apple.Student (ch7.com.apple.Person and 
        //ch7.com.apple.Student are in unnamed module of loader 'app')
        //at ch7.com.apple.Sample.main(Student.java:19)
        //ClassCast(형변환)Exception(오류)

        //구현(implementation)
        //인터페이스(interface)

        System.out.println(철수.name);
    }
    */

    //7.3.3
    public static final int NO_PERSON = 100;
    //literal

    public static void main(String[] args) {
        // Student s1 = new Student();
        // Student s2 = new Student();
        // Student s3 = new Student();
        // Student s4 = new Student();

        /*
        Student[] saar = new Student[NO_PERSON];
        // sarr[0] = new Student();
        //Student를 가리킬 수 있는 referrence 변수(4byte)

        for (int i = 0; i < NO_PERSON; i++) 
            saar[i] = new Student();

        for (int i = 0; i < NO_PERSON; i++) 
            saar[i].eat();    
        */

        //new Student로 하면 실행 안됨, Person이 Student 포함 못해서?
        Person[] aar = new Person[NO_PERSON];
        aar[0] = new Person();
        aar[1] = new Student();
        aar[2] = new Person();
        aar[3] = new Student();

        // for (int i = 0; i < NO_PERSON; i++) 
        //     aar[i].eat();   
        
        eatPersons(aar);
    }

    

    //main이 static이어서 static 밖에 못부름
    public static void eatPersons(Person[] p) {
        for (int i = 0; i < p.length; i++) 
            p[i].eat();
    }
}