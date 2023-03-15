package ch6;
public class CalculatorExample {
    public static void main(String[] args) {
        /*
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2: " + result2);
        
        myCalc.powerOff();

        double result3 = myCalc.areaRectangle(10);
        double result4 = myCalc.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 = " + result3);
        System.out.println("직사각형 넓이 = " + result4);
        */

        // 2022.10.13
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.plus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

        // System.out.println("안녕");
        // System.err.println("hello");
    }
}
