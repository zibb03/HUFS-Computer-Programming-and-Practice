package ch7.com.samsung;

import ch7.com.apple.Person;

public class E extends Person {
    public void eat() {
        name = "value";
        //method(); //무한히 자기 자신을 부름
        super.eat();
    }
}
