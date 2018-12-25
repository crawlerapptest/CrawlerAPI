package com.crawler.api.crawlerAPI.DataRepository;

import com.crawler.api.crawlerAPI.mapper.totalPostsByTagAndCountry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface totalPostsByTagAndCountryRepository extends MongoRepository<totalPostsByTagAndCountry, String> {
    @Query("{}")
    List<totalPostsByTagAndCountry> listTotalPostsByTagAndCountry();
}
