public class FieldInitValue {
    byte byteField = 0;
    short shortField = 0;
    int intField = 100;
    long longField = 0;

    boolean booleanField = true;
    char charField = 0;

    float floatField = 0;
    double doubleField = 0;

    int[] arrField = { 0 };
    String referenceField = "";

    FieldInitValue() {
        charField = 'A';
        longField = 1000000000;
        floatField = 3.14f;
        referenceField = "javaclass";
    }
}
