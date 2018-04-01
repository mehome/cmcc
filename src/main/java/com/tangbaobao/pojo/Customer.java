package com.tangbaobao.pojo;

/**
 * `customerId` char(50) NOT NULL,
 * `customerName` char(15) DEFAULT NULL,
 * `sex` char(2) DEFAULT NULL,
 * `birthDay` date DEFAULT NULL,
 * `address` char(50) DEFAULT NULL,
 * `phoneNumber` char(15) DEFAULT NULL,
 * `romingState` char(15) DEFAULT NULL,
 * `callLeave` char(15) DEFAULT NULL,
 * `certificateCard` char(50) DEFAULT NULL,
 */
public class Customer {
    private String customerId;
    private String customerName;
    private String sex;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String romingState;
    private String callLeave;
    private String certificateCard;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRomingState() {
        return romingState;
    }

    public void setRomingState(String romingState) {
        this.romingState = romingState;
    }

    public String getCallLeave() {
        return callLeave;
    }

    public void setCallLeave(String callLeave) {
        this.callLeave = callLeave;
    }

    public String getCertificateCard() {
        return certificateCard;
    }

    public void setCertificateCard(String certificateCard) {
        this.certificateCard = certificateCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", romingState='" + romingState + '\'' +
                ", callLeave='" + callLeave + '\'' +
                ", certificateCard='" + certificateCard + '\'' +
                '}';
    }
}
