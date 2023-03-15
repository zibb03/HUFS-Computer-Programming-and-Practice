package ch12;

import java.awt.*;

public class BeepTask2 extends Thread{
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
            toolkit.beep();
        }
    }
}
