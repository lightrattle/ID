package com.id.controller;

import com.id.service.NoticesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/notices", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class NoticesController {
    @Autowired
    private NoticesService noticesService;

    @RequestMapping("/getNoticeListByUserid")
    public List<Map<String, Object>> getNoticeListByUserid(int userid){
        return noticesService.getNoticeListByUserid(userid);
    }

    @RequestMapping("/getNoticeListByUseridAndNotRead")
    public List<Map<String, Object>> getNoticeListByUseridAndNotRead(int userid){
        return noticesService.getNoticeListByUseridAndNotRead(userid);
    }

    @RequestMapping("/getNoticeListByUseridAndReaded")
    public List<Map<String, Object>> getNoticeListByUseridAndReaded(int userid){
        return noticesService.getNoticeListByUseridAndReaded(userid);
    }

    @RequestMapping("/insertOneNotice")
    public boolean insertOneNotice(int userid, Date noticetime, String notice){
        return noticesService.insertOneNotice(userid, noticetime, notice);
    }

    @RequestMapping("/updateStatus")
    public boolean updateStatus( int userid, int noticeid){
        return noticesService.updateStatus(userid, noticeid);
    }

    @RequestMapping("/deleteOneNotice")
    public boolean deleteOneNotice(int noticeid){
        return noticesService.deleteOneNotice(noticeid);
    }
}
