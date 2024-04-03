package com.ashikagroup.data_feed_api.dto;

import com.ashikagroup.data_feed_api.models.CompanyNews;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class NewsTableDto {

    @JsonProperty("Table")
    private List<CompanyNews> table;

    public NewsTableDto(){}

    public List<CompanyNews> getTable() {
        return table;
    }

    public void setTable(List<CompanyNews> table) {
        this.table = table;
    }
}
