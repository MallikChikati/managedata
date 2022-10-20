package com.capmarkets.counterparties.managedata.repository;

import com.capmarkets.counterparties.managedata.model.CounterParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterPartyRepo extends JpaRepository<CounterParty, Integer> {

}
