package com.ashikagroup.data_feed_api.repositories;

import com.ashikagroup.data_feed_api.models.WorldIndicesHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorldIndicesHistoryRepository extends JpaRepository<WorldIndicesHistory, Integer> {
}
