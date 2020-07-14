package com.gan.wcarefinanceservice.jpa;

import com.gan.wcarefinanceservice.entity.WcGoal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WcGoalRepository extends CrudRepository<WcGoal, Integer> {

    List<WcGoal> findByWcCustomerId(int wcCustomerId);

}

