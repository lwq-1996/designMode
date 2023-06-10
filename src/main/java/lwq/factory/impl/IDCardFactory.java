package lwq.factory.impl;

import lwq.factory.Factory;
import lwq.factory.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: designMode
 * @Filename: IDCardFactory
 * @Author: LWQ
 * @Data:2023/6/10 14:41
 * @Description:
 */

public class IDCardFactory extends Factory {
    private List<Product> owners = new ArrayList<>();

    @Override
    protected Product creatProduct(String owner) {
        System.out.println(owner + "IDCardFactory creatProduct is running!");
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("IDCardFactory registerProduct is running!");
        owners.add(product);
    }
}
