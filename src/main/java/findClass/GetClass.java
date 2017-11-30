package findClass;

/**
 * Created by lihaixu on 17/9/12.
 */
public class GetClass {
    public static void main(String[] args) throws Exception {
        //方式1：Class.forName（"类名"）
        Class clazz1= Class.forName("com.fuyuan.example.bean.People");
        System.out.println("Class.forName()方式 ：" + clazz1);

        //第二种：对象.getClass()方法
        People people=new People();
        Class clazz2 = people.getClass();
        System.out.println("对象.getClass()方式 ：" + clazz2 + ", "  + (clazz1 == clazz2));

        //第三种：类名.class方法
        Class clazz3 = People.class;
        System.out.println("类名.class方式 ：" + clazz3 + ", "  + (clazz1 == clazz3));
    }

}
