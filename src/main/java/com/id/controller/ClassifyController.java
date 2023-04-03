package com.id.controller;

import com.id.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/classify", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class ClassifyController {
    @Autowired
    private ClassifyService classifyService;

    @RequestMapping("/getListClassify")
    public List<Map<String, Object>> getListClassify(){
        return classifyService.getListClassify();
    }

    @RequestMapping("/insertOneClassify")
    public boolean insertOneClassify(String classifyname){
        return classifyService.insertOneClassify(classifyname);
    }

    @RequestMapping("/deleteOneClassify")
    public boolean deleteOneClassify(String classifyname){
        return classifyService.deleteOneClassify(classifyname);
    }
}
