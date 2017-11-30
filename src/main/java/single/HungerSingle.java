package single;

/**
 * Created by lihaixu on 17/11/22.
 * 饥汉式
 * 每次进来都会创建一个新的实例,耗费资源
 */
public class HungerSingle {

    //重写无参构造器,避免外部调用,创建实例
    private HungerSingle(){

    };

    private static final HungerSingle h = new HungerSingle();

    public HungerSingle getH(){
        return h;
    }

}
