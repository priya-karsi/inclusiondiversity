package com.example.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class TestRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String ,Object>> test(){

        return jdbcTemplate.queryForList(
                "SELECT * FROM Category");
    }
}
