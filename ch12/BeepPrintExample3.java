package ch12;

public class BeepPrintExample3 {
    public static void main(String[] args) {
        Thread thread = new BeepTask();
        Thread thread1 = new BeepTask2();
        thread.start();
        //(같은 BeepTask)여러 개 만들어 실행해도 겹쳐서 소리나지 않음.
        thread1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
