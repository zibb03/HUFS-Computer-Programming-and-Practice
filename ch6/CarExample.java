package ch6;
// public class CarExample {
//     public static void main(String[] args) {
//         Car myCar = new Car("검정", 3000);
//         //Car myCar = new Car();
//         //System.out.println(myCar.bodyColor);
//         System.out.println(myCar.color);
//     }
// }

//2022.10.06, P.216
public class CarExample {
    public static void main(String[] args) {
        Car Car1 = new Car();
        System.out.println("Car1.company :" + Car1.company);
        System.out.println();

        Car Car2 = new Car("자가용");
        System.out.println("Car2.company :" + Car2.company);
        System.out.println();

        Car Car4 = new Car("택시", "검정", 200);
        System.out.println("Car4.company :" + Car4.company);
        System.out.println("Car4.color :" + Car4.color);
        System.out.println("Car4.maxSpeed :" + Car4.color);
        System.out.println();
    }
}
