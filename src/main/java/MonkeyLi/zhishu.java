package MonkeyLi;

/**
 * Created by lihaixu on 18/1/4.
 */
public class zhishu {

    public static void main(String[] args) {
        zhishu zhishu = new zhishu();
        zhishu.findAll(100);

    }

    public void findAll(int n){
        for (int i = 1; i <n; i++) {
            if(find(i))
                System.out.print(i+" ");
        }

    }

    public static  boolean find (int n){
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n%i==0)
               return false;
           int a = -2;
       }
       return true;
    }

}

