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

    @RequestMapping("/judgeAttention")
    public int judgeAttention(int userid, String nowimageusername){
        return attentionService.judgeAttention(userid, nowimageusername);
    }

    @RequestMapping("/insertOneAttention")
    public boolean insertOneAttention(int userid, String nowimageusername){
        return attentionService.insertOneAttention(userid, nowimageusername);
    }

    @RequestMapping("/deleteOneAttention")
    public boolean deleteOneAttention(int userid, String nowimageusername){
        return attentionService.deleteOneAttention(userid, nowimageusername);
    }
}
