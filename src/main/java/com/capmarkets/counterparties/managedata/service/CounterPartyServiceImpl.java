package com.capmarkets.counterparties.managedata.service;

import com.capmarkets.counterparties.managedata.model.CounterParty;
import com.capmarkets.counterparties.managedata.repository.CounterPartyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CounterPartyServiceImpl {

    @Autowired
    private CounterPartyRepo counterPartyRepo;


    public String saveCounterParty(CounterParty counterParty) {
        CounterParty counterParty1= counterPartyRepo.save(counterParty);
        return  (counterParty1==null)?"Counterparty failed to save to DB":"Counterparty Successfully saved";
    }

    public CounterParty findByTxnId(int cpId) {
        return counterPartyRepo.findById(cpId).get();
    }

    public List<CounterParty> getList(){
        return counterPartyRepo.findAll();
    }

    public String deleteCounterParty(int id) {
        counterPartyRepo.delete(findByTxnId(id));
        return "Delete successful for cp id "+id;
    }
}
