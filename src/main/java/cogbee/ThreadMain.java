package cogbee;

import java.io.IOException;

public class ThreadMain {
    public static void main(String args[]) throws IOException {
        PrintingNum printingNum1 = new PrintingNum();
        PrintingNum printingNum2 = new PrintingNum();
        int n = 10;
        try {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    //printingNum2.notify();
                    System.out.println("Thread 1 : " + i);
                    //printingNum2.wait(5);
                    printingNum1.start();
                } else {
                    //printingNum1.notify();
                    System.out.println("Thread 2 : " + i);
                   // printingNum1.wait(5);
                    printingNum2.start();
                }

            }
        } catch (Exception ex) {
            System.out.println("Exception caught : " + ex.toString());
        }
    }
}
