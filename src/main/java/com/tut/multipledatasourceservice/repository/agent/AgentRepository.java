package com.tut.multipledatasourceservice.repository.agent;

import com.tut.multipledatasourceservice.model.db.agent.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent,Long> {
}
