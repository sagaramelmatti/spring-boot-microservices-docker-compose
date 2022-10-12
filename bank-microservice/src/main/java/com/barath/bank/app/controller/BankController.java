package com.barath.bank.app.controller;

import com.barath.bank.app.entity.Bank;
import com.barath.bank.app.service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BankController {

    private final BankService bankService;


    public BankController ( BankService bankService ) {
        super ();
        this.bankService = bankService;
    }

    @GetMapping(value = "/")
    public List<Bank> getAllBanks () {
        return bankService.getBanks ();
    }

    @PostMapping(value = "/bank")
    public Bank addBank ( @RequestBody Bank bank ) {

        return bankService.addBank ( bank );


    }


    @GetMapping(value = "/bank")
    public Optional<Bank> getBank ( @RequestParam("id") long bankId ) {

        return bankService.getBank ( bankId );
    }

    @GetMapping(value = "/bank/byName")
    public Bank getBank ( @RequestParam("name") String bankName ) {
        return bankService.getBank ( bankName );
    }

    @PutMapping(value = "/bank")
    public Bank updateBank ( @RequestBody Bank bank ) {
        return bankService.updateBank ( bank );
    }

    @ExceptionHandler(Exception.class)
    public String handleeError ( Exception ex ) {
        return ex.getMessage ();
    }


}
