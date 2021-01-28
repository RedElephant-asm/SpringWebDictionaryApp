package org.SpringWebDictionaryApp.handlers;

import org.SpringWebDictionaryApp.DAO.RecordsCRUD;
import org.SpringWebDictionaryApp.models.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordControllerHandler {

    @Autowired
    private RecordsCRUD recordsCRUD;

    public RecordControllerHandler(){}

    public RecordControllerHandler(RecordsCRUD recordsCRUD){
        this.recordsCRUD = recordsCRUD;
    }

    public List<Record> findAll(){
        return this.recordsCRUD.findAll();
    }
}
