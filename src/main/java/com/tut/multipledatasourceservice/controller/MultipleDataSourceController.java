package com.tut.multipledatasourceservice.controller;

import com.tut.multipledatasourceservice.model.db.agent.Agent;
import com.tut.multipledatasourceservice.model.db.merchant.Merchant;
import com.tut.multipledatasourceservice.service.MultipleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service")
public class MultipleDataSourceController {

    @Autowired
    private MultipleService multipleService;

    @PostMapping(value = "add-agent")
    public void addAgent(@RequestBody Agent agent){
        multipleService.addAgent(agent);
    }

    @PostMapping(value = "add-merchant")
    public void addMerchant(@RequestBody Merchant merchant){
        multipleService.addMerchant(merchant);
    }
}
