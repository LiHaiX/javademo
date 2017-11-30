package Factory;

/**
 * Created by lihaixu on 17/11/21.
 */
public class abstractFactorySum extends abstractFactory {
    @Override
    public Simpel getSimpelClass() {
        return new Simpel();
    }

    @Override
    public Simpel2 creator(String name) {
        return new Simpel2();
    }
}
