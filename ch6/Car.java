package ch6;

// public class Car {
//     //String bodyColor;
//     String color;
//     int speed;
  
//     Car(String color, int cc) {
//       this.color = color;
//       speed = cc;
//     }
// }

//2022.10.06, P.216
public class Car {
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  Car() {

  }

  Car(String model) {
    this(model, "은색", 250);
  }

  Car(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}