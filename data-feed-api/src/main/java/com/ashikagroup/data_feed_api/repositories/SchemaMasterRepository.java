package com.ashikagroup.data_feed_api.repositories;

import com.ashikagroup.data_feed_api.models.SchemaMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchemaMasterRepository extends JpaRepository<SchemaMaster, Integer> {
}
