package com.ashikagroup.data_feed_api.dto;

import com.ashikagroup.data_feed_api.models.CompanyMaster;
import com.ashikagroup.data_feed_api.models.CompanyNews;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MasterTableDto {

    @JsonProperty("Table")
    private List<CompanyMaster> table;

    public MasterTableDto(){}

    public List<CompanyMaster> getTable() {
        return table;
    }

    public void setTable(List<CompanyMaster> table) {
        this.table = table;
    }
}
