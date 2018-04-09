package thread;

/**
 * Created by lihaixu on 18/1/3.
 */
public class SyncTest {

    public Object getIPhone(){
        synchronized (this){
            return new Object();
        }
    }

    public Object getSum(){
        synchronized (SyncTest.class){
            return new Object();
        }
    }
}
