package com.example.CarProject.service;


import com.example.CarProject.entity.Dealer;
import com.example.CarProject.model.DealerModel;
import com.example.CarProject.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service


public class CarsService {

  @Autowired
  private DealerRepository dealerRepository;



        public void addval(DealerModel dealerModel)
        {

            Dealer det = new Dealer();
            det.setId(dealerModel.getId());
            det.setName(dealerModel.getName());
            det.setAddress(dealerModel.getAddress());
            det.setPhonenumber(dealerModel.getPhonenumber());
            dealerRepository.save(det);

        }



        public List<DealerModel> get()
        {
        List<Dealer> details =dealerRepository.findAll();
        return details.stream().map(cust-> conversion(cust)).collect(Collectors.toList());
        }




        public DealerModel conversion(Dealer dealerEntity)
        {
            return new DealerModel(dealerEntity.getId(),
                    dealerEntity.getName(),
                    dealerEntity.getAddress(),
                    dealerEntity.getPhonenumber());
        }



    public void delete()
    {

        dealerRepository.deleteAll();
    }








}
