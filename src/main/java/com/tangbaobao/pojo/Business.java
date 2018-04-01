package com.tangbaobao.pojo;

import java.util.List;

/**
 * `chargeItemId` varchar(50) NOT NULL,
 * `chargeItemName` varchar(15) DEFAULT NU
 */
public class Business {
    private String chargeItemId;
    private String chargeItemName;
    private String state;

    public String getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(String chargeItemId) {
        this.chargeItemId = chargeItemId;
    }

    public String getChargeItemName() {
        return chargeItemName;
    }

    public void setChargeItemName(String chargeItemName) {
        this.chargeItemName = chargeItemName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
