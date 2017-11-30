package algorithm;

import java.util.*;

/**
 * Created by lihaixu on 17/7/6.
 * 1:合并排序，将两个已经排序的数组合并成一个数组，其中一个数组能容下两个数组的所有元素;
 */
public class MergeArraySort {

    public static void main(String[] args) {
        int a [] ={1,2,38,4,30};
        int b [] = {30,1,20,78};
        MergeArraySort mergeArraySort = new MergeArraySort();
        mergeArraySort.mergeSort(a,b);
    }

    private void mergeSort(int [] arraya ,int[] arrayb){
        List<Integer> mergelist = new ArrayList<Integer>();
        //把 arraya加入mergelist数组
        for (int anArraya : arraya) {
            mergelist.add(anArraya);
        }
        //把 arrayb加入mergelist数组
        for (int i = 0; i < arrayb.length; i++) {
            mergelist.add(arrayb[i]);
        }
        //使用sort进行排序
        Collections.sort(mergelist);
        System.out.println(mergelist);

    }
}
