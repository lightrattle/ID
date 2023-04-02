package com.id.controller;

import com.id.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/classify", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class ClassifyController {
    @Autowired
    private ClassifyService classifyService;


}
