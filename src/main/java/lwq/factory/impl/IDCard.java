package lwq.factory.impl;

import lwq.factory.Product;

/**
 * @Projectname: designMode
 * @Filename: IDCard
 * @Author: LWQ
 * @Data:2023/6/10 14:41
 * @Description:
 */

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "使用了IDCard!");
    }
}
