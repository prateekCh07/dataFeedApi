package com.ashikagroup.data_feed_api.dto;

import com.ashikagroup.data_feed_api.models.AmcMaster;
import com.ashikagroup.data_feed_api.models.WorldIndicesHistory;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WorldIndicesHistoryTableDto {

    @JsonProperty("Table")
    private List<WorldIndicesHistory> table;

    public WorldIndicesHistoryTableDto(){}

    public List<WorldIndicesHistory> getTable() {
        return table;
    }

    public void setTable(List<WorldIndicesHistory> table) {
        this.table = table;
    }
}
