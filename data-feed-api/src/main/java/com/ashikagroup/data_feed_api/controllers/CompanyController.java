package com.ashikagroup.data_feed_api.controllers;

import com.ashikagroup.data_feed_api.dto.ResponseDto;
import com.ashikagroup.data_feed_api.exceptions.DataNotFoundException;
import com.ashikagroup.data_feed_api.models.*;
import com.ashikagroup.data_feed_api.services.CompanyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("feeds")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("insertCompanyNewsDetailsToDatabase")
    public ResponseEntity<ResponseDto> insertCompanyNewsDetailsToDatabase() throws JsonProcessingException {
        companyService.insertCompanyNewsDetailsToDatabase();
        return new ResponseEntity<>(new ResponseDto(HttpStatus.OK, "Data is saved into database successfully."), HttpStatus.OK);
    }

    @GetMapping("showAllNewsDetails")
    public ResponseEntity<List<CompanyNews>> getAllNewsDetails() throws DataNotFoundException {
        List<CompanyNews> companyNewsList = companyService.getAllNewsDetails();
        return new ResponseEntity<>(companyNewsList, HttpStatus.OK);
    }

    @GetMapping("showAllNewsDetailsBySubSection")
    public ResponseEntity<List<CompanyNews>> getAllNewsDetailsBySubSection(@RequestParam String subSection) throws Exception {
        List<CompanyNews> companyNewsList = companyService.getAllNewsDetailsBySubSection(subSection);
        return new ResponseEntity<>(companyNewsList, HttpStatus.OK);
    }

    @PostMapping("insertCompanyMasterDetailsToDatabase")
    public ResponseEntity<ResponseDto> insertCompanyMasterDetails() throws JsonProcessingException {
        companyService.insertMasterDetailsIntoDatabase();
        return new ResponseEntity<>(new ResponseDto(HttpStatus.OK, "Data is saved in CompanyMaster table."), HttpStatus.OK);
    }

    @GetMapping("showAllMasterDetails")
    public ResponseEntity<List<CompanyMaster>> getAllMasterDetails() throws DataNotFoundException {
        List<CompanyMaster> companyMasterList = companyService.getAllMasterDetails();
        return new ResponseEntity<>(companyMasterList, HttpStatus.OK);
    }

    @PostMapping("insertAmcMasterDetailsToDatabase")
    public ResponseEntity<ResponseDto> insertAmcMasterDetails() throws JsonProcessingException {
        companyService.insertAmcMasterDetails();
        return new ResponseEntity<>(new ResponseDto(HttpStatus.OK, "Amc Master details are added successfully."), HttpStatus.OK);
    }

    @GetMapping("showAllAmcMasterDetails")
    public ResponseEntity<List<AmcMaster>> getAllAmcMasterDetails() throws DataNotFoundException {
        List<AmcMaster> amcMasterList = companyService.getAllAmcMasterDetails();
        return new ResponseEntity<>(amcMasterList, HttpStatus.OK);
    }

    @PostMapping("insertSchemaMasterDetailsToDatabase")
    public ResponseEntity<ResponseDto> insertSchemaMasterDetails() throws JsonProcessingException {
        companyService.insertSchemaMasterDetails();
        return new ResponseEntity<>(new ResponseDto(HttpStatus.OK, "Schema Master details are added successfully."), HttpStatus.OK);
    }

    @GetMapping("showAllSchemaMasterDetails")
    public ResponseEntity<List<SchemaMaster>> getAllSchemaMasterDetails() throws DataNotFoundException {
        List<SchemaMaster> schemaMasterList = companyService.getAllSchemaMasterDetails();
        return new ResponseEntity<>(schemaMasterList, HttpStatus.OK);
    }

    @PostMapping("insertWorldIndicesDetailsToDatabase")
    public ResponseEntity<ResponseDto> insertWorldIndicesDetails() throws JsonProcessingException {
        companyService.insertWorldIndicesDetails();
        return new ResponseEntity<>(new ResponseDto(HttpStatus.OK, "Schema World indices details are added successfully."), HttpStatus.OK);
    }

    @GetMapping("showAllIndicesMasterDetails")
    public ResponseEntity<List<WorldIndicesMaster>> getAllIndicesMasterDetails() throws DataNotFoundException {
        List<WorldIndicesMaster> worldIndicesMasterList = companyService.getAllIndicesMasterDetails();
        return new ResponseEntity<>(worldIndicesMasterList, HttpStatus.OK);
    }

    @PostMapping("insertWorldIndicesHistoryDetailsToDatabase")
    public ResponseEntity<ResponseDto> insertWorldIndicesHistoryDetails() throws JsonProcessingException {
        companyService.insertWorldIndicesHistoryDetails();
        return new ResponseEntity<>(new ResponseDto(HttpStatus.OK, "Schema World indices history details are added successfully."), HttpStatus.OK);
    }

    @GetMapping("showAllIndicesHistoryDetails")
    public ResponseEntity<List<WorldIndicesHistory>> getAllIndicesHistoryDetails() throws DataNotFoundException {
        List<WorldIndicesHistory> worldIndicesHistoryList = companyService.getAllIndicesHistoryDetails();
        return new ResponseEntity<>(worldIndicesHistoryList, HttpStatus.OK);
    }
}
