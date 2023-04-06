package com.id.controller;

import com.id.service.ImagesService;
import com.id.utils.MultipartFileToFile;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/images", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class ImagesController {
    @Autowired
    private ImagesService imagesService;

    @RequestMapping("/getImagesListAll")
    public List<Map<String, Object>> getImagesListAll(){
        return imagesService.getImagesListAll();
    }

    @RequestMapping("/getImagesListByUserid")
    public List<Map<String, Object>> getImagesListByUserid(int userid){
        return imagesService.getImagesListByUserid(userid);
    }

    @RequestMapping("/getImagesListByClassifyname")
    public List<Map<String, Object>> getImagesListByClassifyname(String classifyname){
        return imagesService.getImagesListByClassifyname(classifyname);
    }

    @RequestMapping("/getImagesListByNotshenhe")
    public List<Map<String, Object>> getImagesListByNotshenhe(){
        return imagesService.getImagesListByNotshenhe();
    }

    @RequestMapping("/getOneImage")
    public List<Map<String, Object>> getOneImage(int imageid){
        return imagesService.getOneImage(imageid);
    }

    @RequestMapping("/insertOneImage")
    public boolean insertOneImage(int userid, int classifyid, Date uptime, String image){
        return imagesService.insertOneImage(userid, classifyid, uptime, image);
    }

    @RequestMapping("/insertOneImageFile")
    public String insertOneImageFile(HttpServletRequest request, HttpServletRequest response, HttpSession session){
        MultipartHttpServletRequest multipartRequest=(MultipartHttpServletRequest) request;
        MultipartFile multipartFile = multipartRequest.getFile("file");
        assert multipartFile != null;
        MultipartFileToFile.saveMultipartFile(multipartFile, "src/main/resources/static/images");
        return MultipartFileToFile.saveMultipartFile(multipartFile, "target/classes/static/images");
    }

    @RequestMapping("/deleteOneImage")
    public boolean deleteOneImage(int imageid){
        return imagesService.deleteOneImage(imageid);
    }

    @RequestMapping("/updatestatus")
    public boolean updatestatus(int imageid, String classifyname) {
        return imagesService.updatestatus(imageid, classifyname);
    }

    @RequestMapping("/getZanByImageid")
    public int getZanByImageid(int imageid){
        return imagesService.getZanByImageid(imageid);
    }

    @RequestMapping("/getCaiByImageid")
    public int getCaiByImageid(int imageid){
        return imagesService.getCaiByImageid(imageid);
    }

    @RequestMapping("/setZanByImageid")
    public boolean setZanByImageid(int imageid){
        return imagesService.setZanByImageid(imageid);
    }

    @RequestMapping("/setCaiByImageid")
    public boolean setCaiByImageid(int imageid){
        return imagesService.setCaiByImageid(imageid);
    }
}
