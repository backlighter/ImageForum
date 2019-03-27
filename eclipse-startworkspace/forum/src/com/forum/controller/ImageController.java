package com.forum.controller;

import java.util.List;


import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.forum.pojo.BaseImage;
import com.forum.service.BaseImageService;

@Controller
@RequestMapping("/image")
public class ImageController {
			
	@Autowired
	private BaseImageService baseImageService;
	
	@RequestMapping(value="/homepage",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String homepage( String Album) {
		
		return baseImageService.getCoverImageByAlbum("/image0.jpg").toString();
		
		
	}
	@RequestMapping(value="/homeblog",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String homeblog( String u_UserName) {
		
		return baseImageService.getImageByUserName("独角兽").toString()+"["+"{\"u_Name\":\"" + "李宇翔" + "\"}"+"]";
	}
	@RequestMapping(value="/details")
	@ResponseBody
	public List<String> details( String u_Name,String p_Image_Url) {
		
		return baseImageService.getAlbumByUserName("/images/jk/1/独角兽/");
	}
	
}
