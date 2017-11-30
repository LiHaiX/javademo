package recurrence;

/**
 * Created by lihaixu on 17/11/13.
 * 求n!
 */
public class RecurrenceCheng {
    public static void main(String[] args) {
        System.out.println(getN(4));
    }

    private static int getN(int n){
        if (n==1){
            return 1;
        }else
        return getN(n-1)*n;
    }
}
