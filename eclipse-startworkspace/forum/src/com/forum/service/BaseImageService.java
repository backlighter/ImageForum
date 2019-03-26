package com.forum.service;

import java.util.List;

import com.forum.pojo.BaseImage;

public interface BaseImageService {
	/**
	 * 用户主页
	 * 
	 * 根据用户名
	 * 查询 该用户下的所有图片
	 * 		
	 */
//	List <BaseImage> getImageByUserName(String u_UserName);
	/**
	 * 
	 * 查看图片页
	 * 
	 * 根据用户名和相册名(相册名从前页传入)
	 * 查询  
	 * 该用户下的该相册
	 * 
	 */
//	List <BaseImage> 
//	getAlbumByUserName(String u_UserName,String Album);
	
	
	
	/**
	 * 
	 * 论坛主页
	 * 
	 * 显示每一个相册的第一张图片
	 * 和 相册拥有者的头像和姓名
	 * 查询每一个相册的第一张图片
	 * 并显示在主页
	 */
	List <BaseImage> 
	getCoverImageByAlbum(String Album);
	
}
