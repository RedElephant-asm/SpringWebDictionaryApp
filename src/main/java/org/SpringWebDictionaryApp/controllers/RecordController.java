package org.SpringWebDictionaryApp.controllers;

import org.SpringWebDictionaryApp.handlers.RecordControllerHandler;
import org.SpringWebDictionaryApp.models.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Records")
public class RecordController {

    @Autowired
    private RecordControllerHandler controllerHandler;

    @GetMapping(path = "/Hello")
    public String getHelloPage(){
        List<Record> all = controllerHandler.findAll();
        all.forEach(record -> System.out.println(record.toString()));
        return "/views/helloView.html";
    }

    @GetMapping(path = "/Main")
    public String getMainPage(){
        return "/views/mainPage.html";
    }

    @PostMapping(path = "/Main")
    public void addRecord(){
        System.out.println("Added");
    }
}
