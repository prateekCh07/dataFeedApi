package com.ashikagroup.data_feed_api.services;

import com.ashikagroup.data_feed_api.dto.*;
import com.ashikagroup.data_feed_api.exceptions.DataNotFoundException;
import com.ashikagroup.data_feed_api.models.*;
import com.ashikagroup.data_feed_api.repositories.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyNewsRepository newsRepository;
    @Autowired
    private CompanyMasterRepository masterRepository;
    @Autowired
    private AmcMasterRepository amcMasterRepository;
    @Autowired
    private SchemaMasterRepository schemaMasterRepository;
    @Autowired
    private WorldIndicesMasterRepository indicesMasterRepository;
    @Autowired
    private WorldIndicesHistoryRepository indicesHistoryRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void insertCompanyNewsDetailsToDatabase() throws JsonProcessingException {
        String url = "https://contentapi.accordwebservices.com/RawData/GetRawDataJSON?filename=company_news&date=30092022&section=NEWS&sub=Company&token=fMqHkvwLKoN6rTyt_j7F3HNgnvhBtWWE";
        String result = restTemplate.getForObject(url, String.class);
        NewsTableDto tableDto = new ObjectMapper().readValue(result, NewsTableDto.class);
        List<CompanyNews> companyNewsList = tableDto.getTable();
        for(CompanyNews cn : companyNewsList) {
            if(Objects.equals(cn.getFlag(), "A") || Objects.equals(cn.getFlag(), "O")) {
                newsRepository.save(cn);
            }
            else if(Objects.equals(cn.getFlag(), "D")) {
                newsRepository.deleteById(cn.getNewsId());
            }
        }
    }

    @Override
    public List<CompanyNews> getAllNewsDetails() throws DataNotFoundException {
        List<CompanyNews> companyNewsList = newsRepository.findAll();
        if(companyNewsList.isEmpty()) throw new DataNotFoundException("Data is not available.");
        return companyNewsList;
    }

    @Override
    public List<CompanyNews> getAllNewsDetailsBySubSection(String subSection) throws Exception {
        List<CompanyNews> companyNewsList = newsRepository.findBySecName(subSection);
        if(companyNewsList.isEmpty()) throw new DataNotFoundException("There is no data for "+subSection+" section");
        return companyNewsList;
    }

    @Override
    public void insertMasterDetailsIntoDatabase() throws JsonProcessingException {
        String url = "https://contentapi.accordwebservices.com/RawData/GetRawDataJSON?filename=Company_master&date=30092022&section=Master&sub=&token=fMqHkvwLKoN6rTyt_j7F3HNgnvhBtWWE";
        String result = restTemplate.getForObject(url, String.class);
        MasterTableDto tableDto = new ObjectMapper().readValue(result, MasterTableDto.class);
        List<CompanyMaster> companyMasterList = tableDto.getTable();
        for(CompanyMaster cm : companyMasterList) {
            if(Objects.equals(cm.getFlag(), "A") || Objects.equals(cm.getFlag(), "O")) {
                masterRepository.save(cm);
            }
            else if(Objects.equals(cm.getFlag(), "D")) {
                masterRepository.deleteById(cm.getFinCode());
            }
        }
    }

    @Override
    public List<CompanyMaster> getAllMasterDetails() throws DataNotFoundException {
        List<CompanyMaster> companyMasterList = masterRepository.findAll();
        if(companyMasterList.isEmpty()) throw new DataNotFoundException("Data is now available.");
        return companyMasterList;
    }

    @Override
    public void insertAmcMasterDetails() throws JsonProcessingException {
        String url = "https://contentapi.accordwebservices.com/RawData/GetRawDataJSON?filename=Amc_mst&date=30092022&section=MFMaster&sub=&token=fMqHkvwLKoN6rTyt_j7F3HNgnvhBtWWE";
        String result = restTemplate.getForObject(url, String.class);
        AmcTableDto tableDto = new ObjectMapper().readValue(result, AmcTableDto.class);
        List<AmcMaster> amcMasterList = tableDto.getTable();
        for(AmcMaster am : amcMasterList) {
            if(Objects.equals(am.getFlag(), "A") || Objects.equals(am.getFlag(), "O")) {
                amcMasterRepository.save(am);
            }
            else if(Objects.equals(am.getFlag(), "D")) {
                amcMasterRepository.deleteById(am.getAmcCode());
            }
        }
    }

    @Override
    public List<AmcMaster> getAllAmcMasterDetails() throws DataNotFoundException {
        List<AmcMaster> amcMasterList = amcMasterRepository.findAll();
        if(amcMasterList.isEmpty()) throw new DataNotFoundException("Data is not available.");
        return amcMasterList;
    }

    @Override
    public void insertSchemaMasterDetails() throws JsonProcessingException {
        String url = "https://contentapi.accordwebservices.com/RawData/GetRawDataJSON?filename=Scheme_master&date=30092022&section=MFMaster&sub=&token=fMqHkvwLKoN6rTyt_j7F3HNgnvhBtWWE";
        String result = restTemplate.getForObject(url, String.class);
        SchemaTableDto tableDto = new ObjectMapper().readValue(result, SchemaTableDto.class);
        List<SchemaMaster> schemaMasterList = tableDto.getTable();
        for(SchemaMaster sm : schemaMasterList) {
            if(Objects.equals(sm.getFlag(), "A") || Objects.equals(sm.getFlag(), "O")) {
                schemaMasterRepository.save(sm);
            }
            else if(Objects.equals(sm.getFlag(), "D")) {
                schemaMasterRepository.deleteById(sm.getSchemaCode());
            }
        }
    }

    @Override
    public List<SchemaMaster> getAllSchemaMasterDetails() throws DataNotFoundException {
        List<SchemaMaster> schemaMasterList = schemaMasterRepository.findAll();
        if(schemaMasterList.isEmpty()) throw new DataNotFoundException("Data is not available.");
        return schemaMasterList;
    }

    @Override
    public void insertWorldIndicesDetails() throws JsonProcessingException {
        String url = "https://contentapi.accordwebservices.com/RawData/GetRawDataJSON?filename=windicesMaster&date=30092022&section=OtherMarketWindices&sub=&token=fMqHkvwLKoN6rTyt_j7F3HNgnvhBtWWE";
        String result = restTemplate.getForObject(url, String.class);
        WorldIndicesMasterTableDto tableDto = new ObjectMapper().readValue(result, WorldIndicesMasterTableDto.class);
        List<WorldIndicesMaster> worldIndicesMasterList = tableDto.getTable();
        for(WorldIndicesMaster wim : worldIndicesMasterList) {
            if(Objects.equals(wim.getFlag(), "A") || Objects.equals(wim.getFlag(), "O")) {
                indicesMasterRepository.save(wim);
            }
            else if(Objects.equals(wim.getFlag(), "D")) {
                indicesMasterRepository.deleteById(wim.getIndexId());
            }
        }
    }

    @Override
    public List<WorldIndicesMaster> getAllIndicesMasterDetails() throws DataNotFoundException {
        List<WorldIndicesMaster> worldIndicesMasterList = indicesMasterRepository.findAll();
        if(worldIndicesMasterList.isEmpty()) throw new DataNotFoundException("Data is not available.");
        return worldIndicesMasterList;
    }

    @Override
    public void insertWorldIndicesHistoryDetails() throws JsonProcessingException {
        String url = "https://contentapi.accordwebservices.com/RawData/GetRawDataJSON?filename=windices_Hist&date=30092022&section=OtherMarketWindices&sub=&token=fMqHkvwLKoN6rTyt_j7F3HNgnvhBtWWE";
        String result = restTemplate.getForObject(url, String.class);
        WorldIndicesHistoryTableDto tableDto = new ObjectMapper().readValue(result, WorldIndicesHistoryTableDto.class);
        List<WorldIndicesHistory> worldIndicesHistoryList = tableDto.getTable();
        for(WorldIndicesHistory wih : worldIndicesHistoryList) {
            if(Objects.equals(wih.getFlag(), "A") || Objects.equals(wih.getFlag(), "O")) {
                indicesHistoryRepository.save(wih);
            }
            else if(Objects.equals(wih.getFlag(), "D")) {
                indicesHistoryRepository.deleteById(wih.getIndexId());
            }
        }
    }

    @Override
    public List<WorldIndicesHistory> getAllIndicesHistoryDetails() throws DataNotFoundException {
        List<WorldIndicesHistory> worldIndicesHistoryList = indicesHistoryRepository.findAll();
        if(worldIndicesHistoryList.isEmpty()) throw new DataNotFoundException("Data is not available.");
        return worldIndicesHistoryList;
    }
}
