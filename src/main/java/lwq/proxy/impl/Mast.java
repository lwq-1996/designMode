package lwq.proxy.impl;

import lwq.proxy.Rent;

/**
 * @Projectname: designMode
 * @Filename: Mast
 * @Author: LWQ
 * @Data: 2025/2/9 14:06
 * @Description:    真实角色：房东
 */

public class Mast implements Rent {
    @Override
    public void rent() {
        System.out.println("房间出租");
    }
}
