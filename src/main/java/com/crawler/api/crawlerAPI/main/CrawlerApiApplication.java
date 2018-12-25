package com.crawler.api.crawlerAPI.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@EnableOAuth2Sso
@SpringBootApplication
@ComponentScan("com.crawler.api.crawlerAPI.controller")
@EnableMongoRepositories("com.crawler.api.crawlerAPI")
public class CrawlerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerApiApplication.class, args);
    }

}




