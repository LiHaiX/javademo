package algorithm;

import java.text.DecimalFormatSymbols;

/**
 * Created by lihaixu on 17/7/6.
 * 计算n!(阶乘),结果中有几个0
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int result =f.getZeroNum(f.getSum(10));
        System.out.println(f.getSum(10));
        System.out.println(result);
    }

    private int getSum(int n){
        int sum=1;
        for (int i = 1; i <=n; i++) {
            sum=sum*i;
            //System.out.println(sum+"循环中的结果");
        }
        return sum;
    }

    private int getZeroNum(int sum){
        String str = Integer.toString(sum);
        //System.out.println(str+"字符串解析");
        int num=0;
        for (int i=0;i<str.length();i++){
            //System.out.println(str.charAt(i));
            String a = Character.toString(str.charAt(i));
            if(a.equals("0")){
                num++;
                //System.out.println(num+"每次的个数");
            }
        }
        return num;
    }
}
