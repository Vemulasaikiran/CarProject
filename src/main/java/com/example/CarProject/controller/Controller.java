package com.example.CarProject.controller;

import com.example.CarProject.model.DealerModel;
import com.example.CarProject.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controller {


    @Autowired
    public CarsService service;

    @PostMapping("/add")
    private void add(@RequestBody DealerModel dealerModel)
    {
        service.add(dealerModel);
    }

    @GetMapping("/get")
    private List<DealerModel> get()
    {
        return service.get();
    }


}
