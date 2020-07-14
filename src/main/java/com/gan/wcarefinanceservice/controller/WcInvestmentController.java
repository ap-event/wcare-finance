package com.gan.wcarefinanceservice.controller;

import com.gan.wcarefinanceservice.common.ControllerUtil;
import com.gan.wcarefinanceservice.entity.WcInvestment;
import com.gan.wcarefinanceservice.service.WcInvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/investment")
public class WcInvestmentController {

    @Autowired
    WcInvestmentService service;

    @CrossOrigin
    @GetMapping
    private List<WcInvestment> findAll() {
        return service.findAll();
    }

    @CrossOrigin
    @GetMapping("findByGoalId/{id}")
    @ResponseBody
    private List<WcInvestment> findByWcGoalId (@PathVariable("id") int id) {
        return service.findByWcGoalId(id);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    @ResponseBody
    private WcInvestment findOne (@PathVariable("id") int id) {
        return service.find(id);
    }

    @CrossOrigin
    @PostMapping
    private ResponseEntity<?> create(@RequestBody WcInvestment entity) {
        Object result = service.create(entity);
        return ControllerUtil.getResponseEntityForCreate(result);
    }

    @CrossOrigin
    @PutMapping
    private WcInvestment update(@RequestBody WcInvestment entity) {
        return service.update(entity);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    private WcInvestment delete (@PathVariable("id") int id) {
        return service.delete(id);
    }
}
