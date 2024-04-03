package com.ashikagroup.data_feed_api.dto;

import com.ashikagroup.data_feed_api.models.CompanyMaster;
import com.ashikagroup.data_feed_api.models.SchemaMaster;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SchemaTableDto {

    @JsonProperty("Table")
    private List<SchemaMaster> table;

    public SchemaTableDto(){}

    public List<SchemaMaster> getTable() {
        return table;
    }

    public void setTable(List<SchemaMaster> table) {
        this.table = table;
    }
}
