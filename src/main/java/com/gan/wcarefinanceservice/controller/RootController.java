package com.gan.wcarefinanceservice.controller;

import com.gan.wcarefinanceservice.common.LogUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    private String root () {
        LogUtil.log("RootController called ... ");
        return "Welcome to Wcare Finance Service !!!";
    }

}
