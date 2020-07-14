package com.gan.wcarefinanceservice.controller;

import com.gan.wcarefinanceservice.common.ControllerUtil;
import com.gan.wcarefinanceservice.entity.WcGoal;
import com.gan.wcarefinanceservice.model.GoalInfo;
import com.gan.wcarefinanceservice.service.WcGoalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/goal")
public class WcGoalController {

    public static final Logger logger = LoggerFactory.getLogger(WcGoalController.class);

    @Autowired
    WcGoalService service;

    @CrossOrigin
    @GetMapping
    private List<WcGoal> findAll() {
        return service.findAll();
    }

    @CrossOrigin
    @GetMapping("findInfoListByCustomerId/{id}")
    @ResponseBody
    private List<GoalInfo> findInfoListByCustomerId (@PathVariable("id") int id) {
        return service.findInfoListByCustomerId(id);
    }

    @CrossOrigin
    @GetMapping("findInfo/{id}")
    @ResponseBody
    private GoalInfo findInfo (@PathVariable("id") int id) {
        return service.findInfo(id);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    @ResponseBody
    private WcGoal findOne (@PathVariable("id") int id) {
        return service.find(id);
    }

    @PostMapping
    private ResponseEntity<?>  create(@RequestBody WcGoal entity) {
        Object createResult = service.create(entity);
        return ControllerUtil.getResponseEntityForCreate(createResult);
    }

    @CrossOrigin
    @PutMapping
    private WcGoal update(@RequestBody WcGoal entity) {
        return service.update(entity);
    }

    @CrossOrigin
    @GetMapping("delete/{id}")
    private WcGoal delete (@PathVariable("id") int id) {
        return service.delete(id);
    }
}
