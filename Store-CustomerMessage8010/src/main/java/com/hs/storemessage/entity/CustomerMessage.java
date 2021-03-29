package com.hs.storemessage.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/26/23:25
 * @Description:
 */
public class CustomerMessage implements Serializable {
    private int customerId;

    private int customerSex;

    private int customerAge;

    private String customerPhone;

    private Date createDate;

    private String customerAddress;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(int customerSex) {
        this.customerSex = customerSex;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "CustomerMessage{" +
                "customerId=" + customerId +
                ", customerSex=" + customerSex +
                ", customerAge=" + customerAge +
                ", customerPhone='" + customerPhone + '\'' +
                ", createDate=" + createDate +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
