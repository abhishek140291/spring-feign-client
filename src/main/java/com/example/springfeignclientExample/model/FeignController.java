package com.example.springfeignclientExample.model;


import com.example.springfeignclientExample.client.GetUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    GetUserDetails getUserDetails;

    @GetMapping("/hello/{id}")
    public Example getDetails(@PathVariable("id")String id){

        return getUserDetails.myExample(id);
    }



}
