package single;

/**
 * Created by lihaixu on 17/11/22.
 * 饱汉式
 * 每次进来会先判断是否有存在的实例,如果没有创建新的,锁的粒度要大些
 */
public class FullSingle {

    //重写无参构造器,避免外部调用,创建实例
    private FullSingle(){}

    private static FullSingle f;

    public FullSingle getF(){
        synchronized (FullSingle.class){
            if (f==null){
                return new FullSingle();
            }
            return f;
        }
    }

}
