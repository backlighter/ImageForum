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
	
	@RequestMapping(value="/forumJson",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String forumJson( String Album) {
		
		return baseImageService.getCoverImageByAlbum("/image0.jpg").toString();
		
		
	}
}
