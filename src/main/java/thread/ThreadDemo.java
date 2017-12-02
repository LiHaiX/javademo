package thread;

/**
 * Created by lihaixu on 17/12/2.
 */
public class ThreadDemo extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("This is Thread " + i);
        }
    }
}
