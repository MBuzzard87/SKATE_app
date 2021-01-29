package com.example.skate_app.controller;

import com.example.skate_app.model.Record;
import com.example.skate_app.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/records")
public class RecordController {


    @Autowired
    private RecordService recordService;


    @GetMapping(value = "/recordlist")
    @ResponseBody
    public List<Record> findAllRecords() {
        return recordService.findAllRecords();

    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Optional<Record> findRecordById(@PathVariable("id") Long id)  {
        return recordService.findRecordById(id);
    }





}
