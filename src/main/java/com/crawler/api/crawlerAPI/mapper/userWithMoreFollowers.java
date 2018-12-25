package com.crawler.api.crawlerAPI.mapper;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "usersOrderByTopFollowers")
public class userWithMoreFollowers {

    @Id
    private ObjectId _id;
    private String user;
    private Integer followers_count;

    public userWithMoreFollowers() {}

    public userWithMoreFollowers(ObjectId _id, String user, Integer followers_count) {
        this._id = _id;
        this.user = user;
        this.followers_count = followers_count;
    }

/*    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getFollowersCount() { return followers_count; }
    public void setFollowersCount(Integer followers_count) { this.followers_count = followers_count; }*/
}
