package com.ashikagroup.data_feed_api.repositories;

import com.ashikagroup.data_feed_api.models.CompanyNews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyNewsRepository extends JpaRepository<CompanyNews, Integer> {

    List<CompanyNews> findBySecName(String subSection);
}