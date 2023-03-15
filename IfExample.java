public class IfExample {
    public static void main(String[] args) {
        int score = 80;

        /*
        if (score >= 90) {
            System.out.println("A");
        }
        //print문의 x: -> 
        if (score < 90) {
            System.out.println("B");
        }
        */

        /*
        if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        */
        
        /*
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80){
            System.out.println("B");
        } else if (score >= 70){
            System.out.println("C");
        } else if (score >= 60){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        */
        
        if (score >= 90) {
            if (score >= 95) {
                System.out.println("A+");
            } else {
                System.out.println("A0");
            } 
        } else {
            if (score >= 85) {
                System.out.println("B+");
            } else {
                System.out.println("B0");
            }
        }
        

    }
}