package Factory;

/**
 * Created by lihaixu on 17/11/21.
 */
public class factoryDemo{

    static Simpel getSimpelClass(int n){
        if(n==1){
            return new Simpel();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        synchronized (factoryDemo.class){
            new factoryDemo();
        }
    }

}
