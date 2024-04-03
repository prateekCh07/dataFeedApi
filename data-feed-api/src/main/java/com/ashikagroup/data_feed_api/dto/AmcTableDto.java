package com.ashikagroup.data_feed_api.dto;

import com.ashikagroup.data_feed_api.models.AmcMaster;
import com.ashikagroup.data_feed_api.models.CompanyMaster;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AmcTableDto {

    @JsonProperty("Table")
    private List<AmcMaster> table;

    public AmcTableDto(){}

    public List<AmcMaster> getTable() {
        return table;
    }

    public void setTable(List<AmcMaster> table) {
        this.table = table;
    }
}
