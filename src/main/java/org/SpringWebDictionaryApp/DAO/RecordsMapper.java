package org.SpringWebDictionaryApp.DAO;

import org.SpringWebDictionaryApp.models.Record;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecordsMapper implements RowMapper<Record> {
    @Override
    public Record mapRow(ResultSet resultSet, int i) throws SQLException {
        Record record = new Record();

        record.setId(resultSet.getInt("id"));
        record.setRecordKey(resultSet.getString("recordKey"));
        record.setRecordWord(resultSet.getString("recordWord"));

        return record;
    }
}
