package com.example.CarProject.service;


import com.example.CarProject.entity.Cars;
import com.example.CarProject.entity.Dealer;
import com.example.CarProject.model.CarsModel;
import com.example.CarProject.model.DealerModel;
import com.example.CarProject.repository.CarsRepository;
import com.example.CarProject.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service


public class CarsService {

  @Autowired
  private DealerRepository dealerRepository;
  @Autowired
  private CarsRepository carsRepository;




        public void addval(DealerModel dealerModel)
        {

            Dealer det = new Dealer();
//            det.setId(dealerModel.getId());
            det.setName(dealerModel.getName());
            det.setAddress(dealerModel.getAddress());
            det.setPhonenumber(dealerModel.getPhonenumber());

            List<Cars> carentity = new ArrayList<>();

            dealerModel.getCars().stream().forEach(deal->{
                Cars carent = new Cars();
                carent.setModel(deal.getModel());
                carent.setPrice(deal.getPrice());
                carentity.add(carent);

            });

            det.setCars(carentity);


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
            return details.stream().map(m->conversion(m)).collect(Collectors.toList());

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
                m.setId(m.getId());
                m.setName(dealer.getName());
                m.setPhonenumber(dealer.getPhonenumber());
                m.setAddress(dealer.getAddress());
                dealerRepository.save(m);
            });

            return null;
        }

        public DealerModel conversion(Dealer dealerEntity)
        {
            List<CarsModel> carent = new ArrayList<>();
            dealerEntity.getCars(carent).stream().forEach(e->
            {
                CarsModel carm = new CarsModel();
                carm.setModelName(e.getModel());
                carm.setPrice(e.getPrice());
                carent.add(carm);
            });

            return new DealerModel(dealerEntity.getId(),
                    dealerEntity.getName(),
                    dealerEntity.getAddress(),
                    dealerEntity.getPhonenumber(),dealerEntity.getCars(carent));
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
