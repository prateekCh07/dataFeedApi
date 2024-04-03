package com.ashikagroup.data_feed_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class SchemaMaster {

    @Id
    @JsonProperty("schemecode")
    private int schemaCode;
    @JsonProperty("amc_code")
    private int amcCode;
    @JsonProperty("scheme_name")
    private String schemaName;
    @JsonProperty("color")
    private String color;
    @JsonProperty("flag")
    private String flag;

    public SchemaMaster(){}

    public int getSchemaCode() {
        return schemaCode;
    }

    public void setSchemaCode(int schemaCode) {
        this.schemaCode = schemaCode;
    }

    public int getAmcCode() {
        return amcCode;
    }

    public void setAmcCode(int amcCode) {
        this.amcCode = amcCode;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
