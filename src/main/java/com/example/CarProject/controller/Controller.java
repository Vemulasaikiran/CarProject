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
    public List<DealerModel> get()
    {
        return service.get();
    }

    @GetMapping("/get/{id}")
    public List<DealerModel> byId(@PathVariable int id)
    {
        return service.getById(id);
    }
    @GetMapping("/get-name/{name}")
    public List<DealerModel> byName(@PathVariable String name)
    {
        return service.getByName(name);
    }
    @GetMapping("/get-address/{address}")
    public List<DealerModel> byAddress(@PathVariable String address)
    {
        return service.getByAddress(address);
    }

    @PutMapping("/{id}")
    public Void replace(@PathVariable int id, @RequestBody DealerModel dealer)
    {

        return  service.replace(id, dealer);
    }











    @DeleteMapping("/delete-by-id/{id}")
    public  void deletById(@PathVariable int id)
    {
        service.deleteById(id);
    }

    @DeleteMapping("/delete")
    public void delete()
    {
        service.delete();
    }



}
