package proxy.moveProxy;

/**
 * Created by lihaixu on 17/9/12.
 */
public class DynamicLoad {

    public static void main(String[] args) {
        String worker = "com.fuyuan.example.bean." + "Excel";
        startWord(worker);
    }

    private static void startWord(String worker) {
        try {
            // 1. 获取字节码文件
            Class clazz = Class.forName(worker);
            // 2. 获取类的对象
            Office office = (Office) clazz.newInstance();
            // 3. 调用相关方法
            office.startWork();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
