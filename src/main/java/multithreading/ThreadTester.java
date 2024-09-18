package multithreading;

public class ThreadTester {
    public static void main(String args[]) {

        System.out.println("Main is Starting");
        /*thread1 spawned from main thread, so child of main thread
        Main is starting and exiting,No order being followed
        No user thread running, then mercy of JVM to run either daemon
        thread or continue & finish its job or end daemon thread abruptly
        Daemon thread lives to serve a user thread, if user thread dies, daemon thread no existence */

        Thread1 thread1 = new Thread1("Thread1");
        //thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new Thread2(), "Thread2");
        thread2.start();

        System.out.println("Main is Exiting");
    }
}
