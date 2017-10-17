package com.modeush.amazon.entity;

import java.util.Date;

public class AzUserEntity {
    private Integer id;

    private String mac;

    private String ip;

    private String vmId;

    private String browser;

    private Integer basicInfoId;

    private Integer addressId;

    private Integer emailId;

    private String email;

    private Integer creditCardId;

    private Integer giftCardId;

    private Integer level;

    private Integer upgrade;

    private Integer status;

    private Date createTime;

    private String updateTime;

    private Integer country;

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId == null ? null : vmId.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public Integer getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(Integer basicInfoId) {
        this.basicInfoId = basicInfoId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(Integer creditCardId) {
        this.creditCardId = creditCardId;
    }

    public Integer getGiftCardId() {
        return giftCardId;
    }

    public void setGiftCardId(Integer giftCardId) {
        this.giftCardId = giftCardId;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setUpgrade(Integer upgrade) {
        this.upgrade = upgrade;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getUpgrade() {
        return upgrade;
    }

    public Integer getStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}