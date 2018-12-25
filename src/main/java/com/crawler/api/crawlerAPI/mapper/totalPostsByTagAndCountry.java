package com.crawler.api.crawlerAPI.mapper;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "totalPostsOrderByTagAndCountry")
public class totalPostsByTagAndCountry {

    @Id
    private ObjectId _id;
    private Integer count;
    private String hashtag;
    private String language;
    private String location;

    public totalPostsByTagAndCountry() {
    }

    public totalPostsByTagAndCountry(ObjectId _id, Integer count, String hashtag, String language, String location) {
        this._id = _id;
        this.count = count;
        this.hashtag = hashtag;
        this.language = language;
        this.location = location;
    }
}
