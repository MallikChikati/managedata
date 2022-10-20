package com.capmarkets.counterparties.managedata.controller;
import com.capmarkets.counterparties.managedata.model.CounterParty;
import com.capmarkets.counterparties.managedata.service.CounterPartyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cmarket")
public class CounterPartyController {
    @Autowired
    private CounterPartyServiceImpl counterPartyService;

    @PostMapping("/savecp")
    public String saveCounterParty(@RequestBody CounterParty counterParty) {
        return counterPartyService.saveCounterParty(counterParty);
    }

    @GetMapping("/getcp/{id}")
    public CounterParty getCP(@PathVariable int id) {
        return counterPartyService.findByTxnId(id);
    }
    
    @GetMapping("/getall")
    public List<CounterParty> getAll() {
        return counterPartyService.getList();
    }
    
    @DeleteMapping("/delcp/{id}")
    public void deleteCP(@PathVariable int id) {
        counterPartyService.deleteCounterParty(id);       
    }
}
