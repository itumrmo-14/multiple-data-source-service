package com.tut.multipledatasourceservice.service;

import com.tut.multipledatasourceservice.model.db.agent.Agent;
import com.tut.multipledatasourceservice.model.db.merchant.Merchant;
import com.tut.multipledatasourceservice.repository.agent.AgentRepository;
import com.tut.multipledatasourceservice.repository.merchant.MerchantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MultipleService {

    @Autowired
    private AgentRepository agentRepository;
    @Autowired
    private MerchantRepository merchantRepository;

    public void addAgent(Agent agent){
        agentRepository.save(agent);
    }

    public void addMerchant(Merchant merchant){
        merchantRepository.save(merchant);
    }
}
