package com.id.controller;

import com.id.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/images", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class ImagesController {
    @Autowired
    private ImagesService imagesService;

    @RequestMapping("/getImagesListByUserid")
    public List<Map<String, Object>> getImagesListByUserid(int userid){
        return imagesService.getImagesListByUserid(userid);
    }

    @RequestMapping("/getImagesListByClassifyname")
    public List<Map<String, Object>> getImagesListByClassifyname(String classifyname){
        return imagesService.getImagesListByClassifyname(classifyname);
    }

    @RequestMapping("/insertOneImage")
    public boolean insertOneImage(int userid, int classifyid, Date uptime, String image){
        return imagesService.insertOneImage(userid, classifyid, uptime, image);
    }

    @RequestMapping("/deleteOneImage")
    public boolean deleteOneImage(int imageid){
        return imagesService.deleteOneImage(imageid);
    }
}
