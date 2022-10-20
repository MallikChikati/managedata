package com.capmarkets.counterparties.managedata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CounterParty {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int txnid;
    private String securityname;
    private String buyorsell;
    private String lender;
    private String receiver;
    private int days;
    private double rateofinterest;
}
