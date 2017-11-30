package Factory;

/**
 * Created by lihaixu on 17/11/21.
 */
public class Simpel2 {
    public static void main(String[] args) {
        abstractFactorySum abstractFactorySum = new abstractFactorySum();
        Simpel simpel = abstractFactorySum.getSimpelClass();
    }
}
