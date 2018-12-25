package com.crawler.api.crawlerAPI.controller;

import com.crawler.api.crawlerAPI.DataRepository.totalPostsByTagAndCountryRepository;
import com.crawler.api.crawlerAPI.DataRepository.totalPostsOrderByHourRepository;
import com.crawler.api.crawlerAPI.DataRepository.usersOrderByTopFollowersRepository;
import com.crawler.api.crawlerAPI.mapper.totalPostsByTagAndCountry;
import com.crawler.api.crawlerAPI.mapper.totalPostsOrderByHour;
import com.crawler.api.crawlerAPI.mapper.userWithMoreFollowers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/crawlerapi")
public class crawlerAPIController {

    @Autowired
    usersOrderByTopFollowersRepository usersOrderByTopFollowersRepo;

    @Autowired
    totalPostsOrderByHourRepository totalPostsOrderByHourRepo;

    @Autowired
    totalPostsByTagAndCountryRepository totalPostsByTagAndCountryRepo;

    @GetMapping("/listAllUsersOrderByTopFollowers")
    public List<userWithMoreFollowers> listAllUsersOrderByTopFollowers() {
        return usersOrderByTopFollowersRepo.listAllUsersOrderByTopFollowers();
    }

    @GetMapping("/listTotalPostsOrderByHour")
    public List<totalPostsOrderByHour> listTotalPostsOrderByHour() {
        return totalPostsOrderByHourRepo.listTotalPostsOrderByHour();
    }

    @GetMapping("/listTotalPostsByTagAndCountry")
    public List<totalPostsByTagAndCountry> listTotalPostsByTagAndCountry() {
        return totalPostsByTagAndCountryRepo.listTotalPostsByTagAndCountry();
    }

}