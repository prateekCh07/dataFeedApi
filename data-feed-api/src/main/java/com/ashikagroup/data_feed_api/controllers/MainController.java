package com.ashikagroup.data_feed_api.controllers;

import com.ashikagroup.data_feed_api.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("dataFeeds")
public class MainController {

    @GetMapping("getData")
    public RedirectView gettingDetailsBasedOnUrl(@RequestParam String section, @RequestParam String subSection){
        return switch (section) {
            case "news" -> new RedirectView("/feeds/showAllNewsDetailsBySubSection?subSection=" + subSection);
            case "master" -> new RedirectView("/feeds/showAllMasterDetails");
            case "gindices" -> new RedirectView("/feeds/showAllIndicesMasterDetails");
            case "schema" -> new RedirectView("/feeds/showAllSchemaMasterDetails");
            case "amc" -> new RedirectView("/feeds/showAllAmcMasterDetails");
            case "gindiceshistory" -> new RedirectView("/feeds/showAllIndicesHistoryDetails");
            default -> new RedirectView("/error?section="+section);
        };
    }

    @GetMapping("error")
    public ResponseEntity<ResponseDto> errorSection(@RequestParam String section){
        return new ResponseEntity<>(new ResponseDto(HttpStatus.BAD_REQUEST, "No section with name :"+section), HttpStatus.BAD_REQUEST);
    }
}
