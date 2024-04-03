package com.ashikagroup.data_feed_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class CompanyMaster {

    @Id
    @JsonProperty("FINCODE")
    private int finCode;
    @JsonProperty("SCRIPCODE")
    private int scripCode;
    @JsonProperty("SCRIP_NAME")
    private String scripName;
    @JsonProperty("SCRIP_GROUP")
    private String scripGroup;
    @JsonProperty("COMPNAME")
    private String compName;
    @JsonProperty("IND_CODE")
    private int indCode;
    @JsonProperty("Industry")
    private String industry;
    @JsonProperty("HSE_CODE")
    private int hseCode;
    @JsonProperty("House")
    private String house;
    @JsonProperty("SYMBOL")
    private String symbol;
    @JsonProperty("SERIES")
    private String series;
    @JsonProperty("ISIN")
    private String isin;
    @JsonProperty("S_NAME")
    private String sName;
    @JsonProperty("RFORMAT")
    private String rFormat;
    @JsonProperty("FFORMAT")
    private String fFormat;
    @JsonProperty("CHAIRMAN")
    private String chairman;
    @JsonProperty("MDIR")
    private String mdir;
    @JsonProperty("COSEC")
    private String cosec;
    @JsonProperty("INC_MONTH")
    private String incMonth;
    @JsonProperty("INC_YEAR")
    private String incYear;
    @JsonProperty("FV")
    private String fv;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Sublisting")
    private String subListing;
    @JsonProperty("Bse_Scrip_ID")
    private String bseScripId;
    @JsonProperty("Securitytoken")
    private int securityToken;
    @JsonProperty("CIN")
    private String cIn;
    @JsonProperty("Bse_sublisting")
    private String bseSubListing;
    @JsonProperty("Nse_sublisting")
    private String nseSubListing;
    @JsonProperty("Flag")
    private String flag;

    public CompanyMaster(){}

    public int getFinCode() {
        return finCode;
    }

    public void setFinCode(int finCode) {
        this.finCode = finCode;
    }

    public int getScripCode() {
        return scripCode;
    }

    public void setScripCode(int scripCode) {
        this.scripCode = scripCode;
    }

    public String getScripName() {
        return scripName;
    }

    public void setScripName(String scripName) {
        this.scripName = scripName;
    }

    public String getScripGroup() {
        return scripGroup;
    }

    public void setScripGroup(String scripGroup) {
        this.scripGroup = scripGroup;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public int getIndCode() {
        return indCode;
    }

    public void setIndCode(int indCode) {
        this.indCode = indCode;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getHseCode() {
        return hseCode;
    }

    public void setHseCode(int hseCode) {
        this.hseCode = hseCode;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getrFormat() {
        return rFormat;
    }

    public void setrFormat(String rFormat) {
        this.rFormat = rFormat;
    }

    public String getfFormat() {
        return fFormat;
    }

    public void setfFormat(String fFormat) {
        this.fFormat = fFormat;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public String getMdir() {
        return mdir;
    }

    public void setMdir(String mdir) {
        this.mdir = mdir;
    }

    public String getCosec() {
        return cosec;
    }

    public void setCosec(String cosec) {
        this.cosec = cosec;
    }

    public String getIncMonth() {
        return incMonth;
    }

    public void setIncMonth(String incMonth) {
        this.incMonth = incMonth;
    }

    public String getIncYear() {
        return incYear;
    }

    public void setIncYear(String incYear) {
        this.incYear = incYear;
    }

    public String getFv() {
        return fv;
    }

    public void setFv(String fv) {
        this.fv = fv;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubListing() {
        return subListing;
    }

    public void setSubListing(String subListing) {
        this.subListing = subListing;
    }

    public String getBseScripId() {
        return bseScripId;
    }

    public void setBseScripId(String bseScripId) {
        this.bseScripId = bseScripId;
    }

    public int getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(int securityToken) {
        this.securityToken = securityToken;
    }

    public String getcIn() {
        return cIn;
    }

    public void setcIn(String cIn) {
        this.cIn = cIn;
    }

    public String getBseSubListing() {
        return bseSubListing;
    }

    public void setBseSubListing(String bseSubListing) {
        this.bseSubListing = bseSubListing;
    }

    public String getNseSubListing() {
        return nseSubListing;
    }

    public void setNseSubListing(String nseSubListing) {
        this.nseSubListing = nseSubListing;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
