package lwq;

import lwq.factory.Factory;
import lwq.factory.Product;
import lwq.factory.impl.IDCardFactory;
import org.junit.jupiter.api.Test;

/**
 * @Projectname: designMode
 * @Filename: Factory_Test
 * @Author: LWQ
 * @Data:2023/6/10 14:55
 * @Description:
 */

public class Factory_Test {

    @Test
    public void test01() {
        Factory factory = new IDCardFactory();
        Product product = factory.creat("张三");
        product.use();
    }
}
