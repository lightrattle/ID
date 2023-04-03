package com.id.controller;

import com.id.service.AttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/attention", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class AttentionController {
    @Autowired
    private AttentionService attentionService;

    @RequestMapping("/getListAttentionByUserid")
    public List<Map<String, Object>> getListAttentionByUserid(int userid){
        return attentionService.getListAttentionByUserid(userid);
    }

    @RequestMapping("/insertOneAttention")
    public boolean insertOneAttention(int userid, int attentionuserid){
        return attentionService.insertOneAttention(userid, attentionuserid);
    }

    @RequestMapping("/deleteOneAttention")
    public boolean deleteOneAttention(int userid, int attentionuserid){
        return attentionService.deleteOneAttention(userid, attentionuserid);
    }
}
