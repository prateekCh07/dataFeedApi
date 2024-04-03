package com.ashikagroup.data_feed_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AmcMaster {

    @Id
    @JsonProperty("amc_code")
    private int amcCode;
    @JsonProperty("amc")
    private String amc;
    @JsonProperty("fund")
    private String fund;
    @JsonProperty("srno")
    private int srno;
    @JsonProperty("office_type")
    private String officeType;
    @JsonProperty("add1")
    private String add1;
    @JsonProperty("add2")
    private String add2;
    @JsonProperty("add3")
    private String add3;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("webiste")
    private String website;
    @JsonProperty("setup_date")
    private String setupDate;
    @JsonProperty("mf_type")
    private String mfType;
    @JsonProperty("trustee_name")
    private String trusteeName;
    @JsonProperty("sponsor_name")
    private String sponsorName;
    @JsonProperty("amc_inc_date")
    private String amcIncDate;
    @JsonProperty("s_name")
    private String sName;
    @JsonProperty("amc_symbol")
    private String amcSymbol;
    @JsonProperty("city")
    private String city;
    @JsonProperty("rtamccode")
    private String rtAmcCode;
    @JsonProperty("flag")
    private String flag;

    public AmcMaster(){}

    public int getAmcCode() {
        return amcCode;
    }

    public void setAmcCode(int amcCode) {
        this.amcCode = amcCode;
    }

    public String getAmc() {
        return amc;
    }

    public void setAmc(String amc) {
        this.amc = amc;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public int getSrno() {
        return srno;
    }

    public void setSrno(int srno) {
        this.srno = srno;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getAdd3() {
        return add3;
    }

    public void setAdd3(String add3) {
        this.add3 = add3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(String setupDate) {
        this.setupDate = setupDate;
    }

    public String getMfType() {
        return mfType;
    }

    public void setMfType(String mfType) {
        this.mfType = mfType;
    }

    public String getTrusteeName() {
        return trusteeName;
    }

    public void setTrusteeName(String trusteeName) {
        this.trusteeName = trusteeName;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getAmcIncDate() {
        return amcIncDate;
    }

    public void setAmcIncDate(String amcIncDate) {
        this.amcIncDate = amcIncDate;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getAmcSymbol() {
        return amcSymbol;
    }

    public void setAmcSymbol(String amcSymbol) {
        this.amcSymbol = amcSymbol;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRtAmcCode() {
        return rtAmcCode;
    }

    public void setRtAmcCode(String rtAmcCode) {
        this.rtAmcCode = rtAmcCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
