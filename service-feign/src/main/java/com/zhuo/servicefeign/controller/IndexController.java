package com.zhuo.servicefeign.controller;

import com.zhuo.servicefeign.interf.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    final private SchedualServiceHi schedualServiceHi;

    @Autowired
    public IndexController(SchedualServiceHi schedualServiceHi) {
        this.schedualServiceHi = schedualServiceHi;
    }

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
