package com.tangbaobao.pojo;

/**
 * `chargeId` varchar(50) NOT NULL,
 * `chargeItemId` varchar(50) DEFAULT NULL,
 * `chargeMoney` varchar(15) DEFAULT NULL,
 */

public class ChargeDetail {
    private String chargeId;
    private String chargeMoney;


    /**
     *
     * 配置多对一关系
     */
    private Business business;



    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }


    public String getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(String chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    @Override
    public String toString() {
        return "ChargeDetail{" +
                "chargeId='" + chargeId + '\'' +
                ", chargeMoney='" + chargeMoney + '\'' +
                ", business=" + business +
                '}';
    }
}
