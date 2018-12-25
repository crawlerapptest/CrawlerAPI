package com.crawler.api.crawlerAPI.DataRepository;

import com.crawler.api.crawlerAPI.mapper.totalPostsOrderByHour;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface totalPostsOrderByHourRepository extends MongoRepository<totalPostsOrderByHour, String> {
    @Query("{}")
    List<totalPostsOrderByHour> listTotalPostsOrderByHour();
}
