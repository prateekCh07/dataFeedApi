package com.ashikagroup.data_feed_api.repositories;

import com.ashikagroup.data_feed_api.models.CompanyMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyMasterRepository extends JpaRepository<CompanyMaster, Integer> {
}