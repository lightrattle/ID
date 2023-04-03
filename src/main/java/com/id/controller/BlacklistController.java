package com.id.controller;

import com.id.service.BlacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/blacklist", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class BlacklistController {
    @Autowired
    private BlacklistService blacklistService;

    @RequestMapping("/getListBlacklistByUserid")
    public List<Map<String, Object>> getListBlacklistByUserid(int userid){
        return blacklistService.getListBlacklistByUserid(userid);
    }

    @RequestMapping("/insertOneBlacklist")
    public boolean insertOneBlacklist(int userid, int attentionuserid){
        return blacklistService.insertOneBlacklist(userid, attentionuserid);
    }

    @RequestMapping("/deleteOneBlacklist")
    public boolean deleteOneBlacklist(int userid, int attentionuserid){
        return blacklistService.deleteOneBlacklist(userid, attentionuserid);
    }
}
