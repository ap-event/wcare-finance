package com.gan.wcarefinanceservice.jpa;

import com.gan.wcarefinanceservice.entity.WcInvestment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WcInvestmentRepository extends CrudRepository<WcInvestment, Integer> {

    List<WcInvestment> findByWcGoalId(int wcGoalId);

}

