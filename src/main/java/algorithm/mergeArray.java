package algorithm;

/**
 * Created by lihaixu on 17/12/28.
 * 合并并排序
 */
public class mergeArray {

    public int [] getMergeArray(int a[],int b[]){
        if (a == null || b ==null){
            return null;
        }

        int res [] = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            res[i+a.length] = b [i];
        }

        for (int i = 0; i < res.length-1; i++) {
            for (int j = 0; j < res.length-i-i; j++) {
                if (res[j]>res[j+1]){
                    int sort = res[j+1];
                    res[j+1] = res[j];
                    res[j]= sort;
                }
            }
        }



        return res;
    }

}
