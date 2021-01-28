package org.SpringWebDictionaryApp.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Record {

    @NotEmpty
    private Integer id;

    @NotEmpty(message = "Key cant be empty.")
    @Size(min = 5, max = 20, message = "Key length must be between 5 and20")
    private String recordKey;

    @NotEmpty(message = "Word cant be empty.")
    @Size(min = 5, max = 20, message = "Word length must be between 5 and20")
    private String recordWord;

    public Record(){}

    public Record(Integer id, String recordKey, String recordWord) {
        this.id = id;
        this.recordKey = recordKey;
        this.recordWord = recordWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getRecordKey() {
        return recordKey;
    }

    public void setRecordKey(String recordKey) {
        this.recordKey = recordKey;
    }

    public String getRecordWord() {
        return recordWord;
    }

    public void setRecordWord(String recordWord) {
        this.recordWord = recordWord;
    }

    @Override
    public String toString() {
        return ""+id+";"+recordKey+";"+recordWord;
    }
}
