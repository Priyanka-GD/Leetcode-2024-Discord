package multithreading;

public class ThreadTester {
    public static void main(String args[]) {
        System.out.println("Main is Starting");
        //thread1 spawned from main thread, so child of main thread
        //No order being followed
        Thread1 thread1 = new Thread1();
        thread1.start();

        System.out.println("Main is Exiting");
    }
}
