package recurrence;

/**
 * Created by lihaixu on 17/11/13.
 * Fibonacci sequence
 */
public class RecurrenceLisp {

    public static void main(String[] args) {
        System.out.println(getN(5));
    }

    private static int getN(int n){
        if(n==1 || n==2){
            return 1;
        }
        return getN(n-1)+getN(n-2);
    }

}
