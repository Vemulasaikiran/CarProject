package com.example.CarProject.service;


import com.example.CarProject.entity.Dealer;
import com.example.CarProject.model.DealerModel;
import com.example.CarProject.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        return details.stream().map(this::conversion).collect(Collectors.toList());
        }

        public List<DealerModel> getById(int id)
        {
            Optional<Dealer> details = dealerRepository.findById(id);
            return details.stream().map(this::conversion).collect(Collectors.toList());

        }
        public List<DealerModel> getByName(String name)
        {
            List<Dealer> deal = dealerRepository.findByName(name);
            return deal.stream().map(this::conversion).collect(Collectors.toList());
        }
        public List<DealerModel> getByAddress(String address)
        {
            List<Dealer> dea = dealerRepository.findByAddress(address);
            return dea.stream().map(this::conversion).collect(Collectors.toList());
        }


        public Void replace(int id, DealerModel dealer)
        {
            Optional<Dealer> data = dealerRepository.findById(id);

            data.stream().forEach(m->
            {
                m.setName(dealer.getName());
                m.setPhonenumber(dealer.getPhonenumber());
                m.setAddress(dealer.getAddress());
                dealerRepository.save(m);
            });

            return null;
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
    public void deleteById(int id)
    {
        dealerRepository.deleteById(id);
    }

}
