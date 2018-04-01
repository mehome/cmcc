package com.tangbaobao.pojo;

import java.util.List;

/**
 * `operatorId` char(50) NOT NULL,
 * `operatorName` char(15) DEFAULT NULL,
 * `operatorPassword` char(15) DEFAULT NULL,
 */
public class Operator {
    private String operatorId;
    private String operatorName;
    private String operatorPassword;

    /**
     * 一对多关系
     */
    private List<Resource> resource;

    public List<Resource> getResource() {
        return resource;
    }

    public void setResource(List<Resource> resource) {
        this.resource = resource;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorPassword() {
        return operatorPassword;
    }

    public void setOperatorPassword(String operatorPassword) {
        this.operatorPassword = operatorPassword;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "operatorId='" + operatorId + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", operatorPassword='" + operatorPassword + '\'' +
                ", resource=" + resource +
                '}';
    }
}
