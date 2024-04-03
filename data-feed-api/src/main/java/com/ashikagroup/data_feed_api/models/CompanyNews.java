package com.ashikagroup.data_feed_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class CompanyNews {

    @Id
    @JsonProperty("NEWSID")
    private int newsId;
    @JsonProperty("SECNAME")
    private String secName;
    @JsonProperty("SUBSECNAME")
    private String subSecName;
    @JsonProperty("DATE")
    private String date;
    @JsonProperty("TIME")
    private String time;
    @JsonProperty("HEADING")
    private String heading;
    @JsonProperty("CAPTION")
    private String caption;
    @JsonProperty("DETAILS")
    private String details;
    @JsonProperty("FINCODE")
    private String finCode;
    @JsonProperty("INDUSTRY")
    private String industry;
    @JsonProperty("FLAG")
    private String flag;

    public CompanyNews(){}

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getSubSecName() {
        return subSecName;
    }

    public void setSubSecName(String subSecName) {
        this.subSecName = subSecName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
