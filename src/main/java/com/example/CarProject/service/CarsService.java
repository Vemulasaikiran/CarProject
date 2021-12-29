package com.example.CarProject.service;


import com.example.CarProject.model.DealerModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class CarsService {
    List<DealerModel> details = new ArrayList<>();

        public void add(DealerModel dealer)
        {
            details.add(dealer);


        }
        public List<DealerModel> get()
        {
            return details;
        }



}
