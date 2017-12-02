package thread;

/**
 * Created by lihaixu on 17/12/2.
 * 纯无聊自己瞎写的
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.run();
        System.out.println(threadDemo.getId());

        RunnableDemo runnableDemo = new RunnableDemo();
        Thread runnableThread = new Thread(runnableDemo);
        runnableDemo.run();
        System.out.print(runnableThread.getId());

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("哈哈哈");
            }
        });

        thread.run();
    }
}
