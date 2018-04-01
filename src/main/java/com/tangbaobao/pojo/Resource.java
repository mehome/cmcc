package com.tangbaobao.pojo;

/**
 * `resourceId` char(50) NOT NULL,
 * `operatorId` char(50) DEFAULT NULL,
 * `typeId` char(50) DEFAULT NULL,
 * `beganSectionNo` char(15) DEFAULT NULL,
 * `endSectionNo` char(15) DEFAULT NULL,
 */
public class Resource {

    private String resourceId;
    private String beganSectionNo;
    private String endSectionNo;
    /**
     * 多对一关系
     */
    private Operator operator;
    /**
     * 多对一关系
     */
    private SectionNoType type;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getBeganSectionNo() {
        return beganSectionNo;
    }

    public void setBeganSectionNo(String beganSectionNo) {
        this.beganSectionNo = beganSectionNo;
    }

    public String getEndSectionNo() {
        return endSectionNo;
    }

    public void setEndSectionNo(String endSectionNo) {
        this.endSectionNo = endSectionNo;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public SectionNoType getType() {
        return type;
    }

    public void setType(SectionNoType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId='" + resourceId + '\'' +
                ", beganSectionNo='" + beganSectionNo + '\'' +
                ", endSectionNo='" + endSectionNo + '\'' +
                ", operator=" + operator +
                ", type=" + type +
                '}';
    }
}
