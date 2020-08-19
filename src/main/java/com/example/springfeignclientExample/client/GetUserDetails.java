package com.example.springfeignclientExample.client;


import com.example.springfeignclientExample.model.Example;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (url="https://jsonplaceholder.typicode.com/todos",name = "firstfeignclient")
public interface GetUserDetails {

    @GetMapping("{id}")
    public Example myExample(@PathVariable("id") String id);
}
