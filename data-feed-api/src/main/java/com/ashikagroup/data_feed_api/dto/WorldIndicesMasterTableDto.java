package com.ashikagroup.data_feed_api.dto;

import com.ashikagroup.data_feed_api.models.WorldIndicesMaster;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class WorldIndicesMasterTableDto {

    @JsonProperty("Table")
    private List<WorldIndicesMaster> table;

    public WorldIndicesMasterTableDto(){}

    public List<WorldIndicesMaster> getTable() {
        return table;
    }

    public void setTable(List<WorldIndicesMaster> table) {
        this.table = table;
    }
}
