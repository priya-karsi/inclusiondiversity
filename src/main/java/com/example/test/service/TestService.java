package com.example.test.service;

import com.example.test.dao.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository ;


    public List<Map<String ,Object>> test(){

        return testRepository.test();
    }
}
