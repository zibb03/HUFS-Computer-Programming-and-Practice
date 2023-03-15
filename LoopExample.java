public class LoopExample {
    public static void main(String[] args) {
        //for문

        // int sum = 0;

        // for(int i = 0; i <= 100; i++) {
        //     sum += i;
        // }
        // //System.out.println("1 ~" + (i - 1) + "까지의 합: " + sum);
        // System.out.println("1 ~ 100" + "까지의 합: " + sum);

        //while문

        // int sum = 0;

        // int i = 1;
        // while(i <= 100) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println("1 ~ " + (i - 1) + "까지의 합: " + sum);
    
        //do-while문

        int sum = 0;

        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("1 ~" + (i - 1) + "까지의 합: " + sum);
    }
}