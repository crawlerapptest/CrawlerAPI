package com.crawler.api.crawlerAPI.DataRepository;

import com.crawler.api.crawlerAPI.mapper.userWithMoreFollowers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;


public interface usersOrderByTopFollowersRepository extends MongoRepository<userWithMoreFollowers, String> {
    @Query("{}")
    List<userWithMoreFollowers> listAllUsersOrderByTopFollowers();
}
