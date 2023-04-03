package com.id.controller;

import com.id.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/comments", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

    @RequestMapping("/getListCommentsByImageid")
    public List<Map<String, Object>> getListCommentsByImageid(int imageid){
        return commentsService.getListCommentsByImageid(imageid);
    }

    @RequestMapping("/getListCommentsByUserid")
    public List<Map<String, Object>> getListCommentsByUserid(int userid){
        return commentsService.getListCommentsByUserid(userid);
    }

    @RequestMapping("/insertOneComment")
    public boolean insertOneComment(int commentuserid, Date commenttime, int imageid, String comment){
        return commentsService.insertOneComment(commentuserid, commenttime, imageid, comment);
    }

    @RequestMapping("/deleteOneComment")
    public boolean deleteOneComment(int commentuserid, int imageid, String comment){
        return commentsService.deleteOneComment(commentuserid, imageid, comment);
    }
}
