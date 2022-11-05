package com.example.test.web;

import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class TestResource {
    @Autowired
    private TestService testService ;

    @GetMapping(value = "/test")
    public List<Map<String,Object>> test(){
        return testService.test();
    }
}
