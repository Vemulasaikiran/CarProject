package com.example.CarProject.controller;

import com.example.CarProject.model.DealerModel;
import com.example.CarProject.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class Controller {


    @Autowired
    public CarsService service;


    @PostMapping("/add-val")
    private void addval(@Valid @RequestBody DealerModel dealerModel)
    {
         service.addval(dealerModel);

//        return new dealerModel(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/get")
    private List<DealerModel> get()
    {
        return service.get();
    }

    @DeleteMapping("/delete")
    public void delete()
    {
        service.delete();
    }



}
