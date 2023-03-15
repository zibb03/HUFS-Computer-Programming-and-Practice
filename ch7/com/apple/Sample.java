package ch7.com.apple;

public class Sample {
    public static final int NO_PERSON = 4;
    //literal

    public static void main(String[] args) {
        Student[] aar = new Student[NO_PERSON];
        aar[0] = new Student();
        aar[1] = new Student();
        aar[2] = new Student();
        aar[3] = new Student();
        
        eatPersons(aar);
    }

    public static void eatPersons(Person[] p) {
        for (int i = 0; i < p.length; i++) 
            p[i].eat();
    }
}
