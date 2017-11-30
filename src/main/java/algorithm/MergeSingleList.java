package algorithm;

import java.util.LinkedList;

/**
 * Created by lihaixu on 17/7/6.
 * 合并两个单链表,倒序打印
 */
public class MergeSingleList {

    public static void main(String[] args) {
        MergeSingleList mergeSingleList = new MergeSingleList();
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        LinkedList<Integer> b = new LinkedList<Integer>();
        b.add(56);
        b.add(78);
        mergeSingleList.listMerge(a,b);
    }

    private void listMerge(LinkedList<Integer> a ,LinkedList<Integer> b){
        LinkedList<Integer> reverseList = new LinkedList<Integer>();
        //System.out.println(b.size());
        for (int i = 0; i < b.size(); i++) {
            a.add(b.get(i));
            //System.out.println(b.get(i));
        }
        //System.out.println(a);
        for (int i = a.size()-1; i >= 0; i--) {
            //System.out.println(i);
            reverseList.add(a.get(i));
        }
        System.out.println(reverseList);

    }
}
