package org.zcy.tester;

import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;

/**
 * Created by 春哥 on 16/12/7.
 */
public class GsonTester {

    public static void main(String args[]) throws InterruptedException {
        Gson gson = new Gson();
        String json = "{\"subscribeId\":39317399,\"kdtId\":4565801,\"expressNo\":\"883702837512478497\",\"expressId\":2,\"OrderNo\":\"E20161205133836057279637\"}";
        ExpressSubscribe subscribe = gson.fromJson(json, ExpressSubscribe.class);

        System.out.println(checkDataValid(subscribe));


    }

    private static boolean checkDataValid(ExpressSubscribe subscribeParam) {
        return !(subscribeParam == null
                || subscribeParam.getKdtId() == null || subscribeParam.getKdtId() <= 0
                || StringUtils.isBlank(subscribeParam.getExpressNo())
                || subscribeParam.getExpressId() == null || subscribeParam.getExpressId() < 0);
    }
}


class ExpressSubscribe {

    /**
     * 口袋通id
     */
    private Long kdtId;
    /**
     * 快递号
     */
    private String expressNo;
    /**
     * 快递公司id
     */
    private Integer expressId;
    /**
     * 订单id
     */
    private String OrderNo;

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public Long getKdtId() {
        return kdtId;
    }

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }
}
