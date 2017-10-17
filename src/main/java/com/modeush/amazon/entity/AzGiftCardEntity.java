package com.modeush.amazon.entity;

import java.math.BigDecimal;

public class AzGiftCardEntity {
    private Integer id;

    private String number;

    private String password;

    private BigDecimal quotaTotal;

    private BigDecimal quotaLeft;

    private String bonusCode;

    private String sign;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public BigDecimal getQuotaTotal() {
        return quotaTotal;
    }

    public void setQuotaTotal(BigDecimal quotaTotal) {
        this.quotaTotal = quotaTotal;
    }

    public BigDecimal getQuotaLeft() {
        return quotaLeft;
    }

    public void setQuotaLeft(BigDecimal quotaLeft) {
        this.quotaLeft = quotaLeft;
    }

    public String getBonusCode() {
        return bonusCode;
    }

    public void setBonusCode(String bonusCode) {
        this.bonusCode = bonusCode == null ? null : bonusCode.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}