package FindTwoPoints;

import java.util.List;

/**
 * Created by lihaixu on 17/12/2.
 */
public class FindElementByHalf {

    public static void main(String[] args) {
        //find 8
        int [] ary = {1,2,3,4,5,6,7,8,13,46,79};
        System.out.println(binarySearch(ary, 5));
        getOneNumberBayHalf(ary,5,0,ary.length);
    }

    //在ary中通过二分查找的方式找到对应数字在ary中的位置
    public static int getOneNumberBayHalf(int [] ary,int number,int start, int end){
        if(start> end)
            return  -1;
        int mid = start +(end -start)/2;
        if (number == ary[mid]) {
            System.out.print("数字:" + number+"的位置在从ary中的第"+mid+"位");
            return mid;
        }
        if (number < ary[mid]){
            return getOneNumberBayHalf(ary,number,start,mid-1);
        }
        //if (number > ary[mid])
        else {
            return getOneNumberBayHalf(ary,number,mid+1,end);
        }
    }


    public static int binarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;
        while (low < high) {
            // 媳妇写法 ,下面代码一定注意,否则会进入死循环
            // int mid =(high - low) / 2;
            // 正确写法如下
            int mid =low + (high - low) / 2;
            if (target == array[mid]) {
                return mid;
            } else if (target > array[mid]) {
                low = mid + 1;
            } else if (target < array[mid]) {
                high = mid;
            }
        }
        return -1;
    }

}
