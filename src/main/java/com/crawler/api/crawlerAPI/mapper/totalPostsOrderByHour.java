package com.crawler.api.crawlerAPI.mapper;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "totalPostsOrderByHour")
public class totalPostsOrderByHour {

    @Id
    private ObjectId _id;
    private Integer hour;
    private Integer totalposts;

    public totalPostsOrderByHour() {}

    public totalPostsOrderByHour(ObjectId _id, Integer hour, Integer totalposts) {
        this._id = _id;
        this.hour = hour;
        this.totalposts = totalposts;
    }

}
