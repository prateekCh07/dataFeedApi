package com.ashikagroup.data_feed_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WorldIndicesMaster {

    @Id
    @JsonProperty("INDEX_ID")
    private int indexId;
    @JsonProperty("INDEXSYMBOL")
    private String indexSymbol;
    @JsonProperty("INDEX_NAME")
    private String indexName;
    @JsonProperty("COUNTRY")
    private String country;
    @JsonProperty("Flag")
    private String flag;

    public WorldIndicesMaster(){}

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public String getIndexSymbol() {
        return indexSymbol;
    }

    public void setIndexSymbol(String indexSymbol) {
        this.indexSymbol = indexSymbol;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
