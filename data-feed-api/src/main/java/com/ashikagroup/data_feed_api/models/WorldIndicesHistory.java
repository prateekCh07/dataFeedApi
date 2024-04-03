package com.ashikagroup.data_feed_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WorldIndicesHistory {

    @Id
    @JsonProperty("Index_id")
    private int indexId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("open")
    private String open;
    @JsonProperty("high")
    private String high;
    @JsonProperty("low")
    private String low;
    @JsonProperty("last")
    private String last;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("adjclose")
    private String adjClose;
    @JsonProperty("Flag")
    private String flag;

    public WorldIndicesHistory(){}

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getAdjClose() {
        return adjClose;
    }

    public void setAdjClose(String adjClose) {
        this.adjClose = adjClose;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
