package lwq.factory;

/**
 * @Projectname: designMode
 * @Filename: Factory
 * @Author: LWQ
 * @Data:2023/6/10 14:39
 * @Description:
 */

public abstract class Factory {
    protected abstract Product creatProduct(String owner);
    protected abstract void registerProduct(Product product);

    public Product creat(String owner) {
        Product product = creatProduct(owner);
        registerProduct(product);
        return product;
    }
}
