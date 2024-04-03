package com.ashikagroup.data_feed_api.services;

import com.ashikagroup.data_feed_api.exceptions.DataNotFoundException;
import com.ashikagroup.data_feed_api.models.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface CompanyService {
    void insertCompanyNewsDetailsToDatabase() throws JsonProcessingException;

    List<CompanyNews> getAllNewsDetails() throws DataNotFoundException;

    void insertMasterDetailsIntoDatabase() throws JsonProcessingException;

    List<CompanyMaster> getAllMasterDetails() throws DataNotFoundException;

    void insertAmcMasterDetails() throws JsonProcessingException;

    List<AmcMaster> getAllAmcMasterDetails() throws DataNotFoundException;

    void insertSchemaMasterDetails() throws JsonProcessingException;

    List<SchemaMaster> getAllSchemaMasterDetails() throws DataNotFoundException;

    void insertWorldIndicesDetails() throws JsonProcessingException;

    List<WorldIndicesMaster> getAllIndicesMasterDetails() throws DataNotFoundException;

    void insertWorldIndicesHistoryDetails() throws JsonProcessingException;

    List<WorldIndicesHistory> getAllIndicesHistoryDetails() throws DataNotFoundException;

    List<CompanyNews> getAllNewsDetailsBySubSection(String subSection) throws Exception;
}
