package com.forum.service.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.mapper.BaseImageMapper;
import com.forum.pojo.BaseBlog;
import com.forum.pojo.BaseDetails;
import com.forum.pojo.BaseImage;
import com.forum.service.BaseImageService;

@Service
public class BaseImageImpl implements BaseImageService {
	
	@Autowired
	private BaseImageMapper baseImageMapper;

//	@Override
//	public List<BaseImage> getAlbumByUserName(String u_UserName, String Album) {
//		return baseImageMapper.getAlbumByUserName(u_UserName, Album);
//	}

	@Override
	public List<BaseImage> getCoverImageByAlbum(String Album) {
		
		return baseImageMapper.getCoverImageByAlbum("%"+Album);
	}

	@Override
	public List<BaseBlog> getImageByUserName(String u_UserName) {
		
		return baseImageMapper.getImageByUserName(u_UserName);
	}

	@Override
	public List<String> getAlbumByUserName( String p_Image_Url) {
		BaseDetails baseDetails = null;
		//baseDetails.setU_Name(baseImageMapper.getUserMessage(u_Name)
		//baseDetails.setP_Image_Url();
		return baseImageMapper.getAlbumByUserName(p_Image_Url+"%");
	}

}
