package org.SpringWebDictionaryApp.DAO;

import org.SpringWebDictionaryApp.models.Record;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RecordsCRUD {

    private JdbcTemplate jdbcTemplate;

    public RecordsCRUD(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Record> findAll(){
        return jdbcTemplate.query("SELECT * FROM Records", new RecordsMapper());
    }
}
