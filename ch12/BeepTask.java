package ch12;

import java.awt.*;

//구현
// public class BeepTask implements Runnable {
//     public void run() {
//         Toolkit toolkit = Toolkit.getDefaultToolkit();
//         for (int i = 0; i < 5; i++) {
//             toolkit.beep();
//             try {
//                 Thread.sleep(500);
//             } catch (Exception e) {

//             }
//         }
//     }
// }

//계승
public class BeepTask extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}

