package com.forum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.forum.pojo.BaseImage;

@Repository
public interface BaseImageMapper {
	/**
	 * 用户主页
	 * 
	 * 根据用户名
	 * 查询 该用户下的所有图片
	 * 		
	 */
//	@Select("")
//	List <BaseImage> getImageByUserName(String u_UserName);
	
	/**
	 * 
	 * 查看图片页
	 * 
	 * 根据用户名和相册名(相册名从前页传入)
	 * 查询  
	 * 该用户下的该相册中的图片
	 * 
	 */
//	@Select("")
//	List <BaseImage> getAlbumByUserName(String u_UserName,String Album);
	
	/**
	 * 
	 * 论坛主页
	 * 
	 * 显示每一个相册的第一张图片
	 * 和 相册拥有者的头像和姓名
	 * 查询每一个相册的第一张图片
	 * 并显示在主页
	 */
	@Select("SELECT u_Name,u_Image,p_Image_Url,p_Tags FROM pic,user WHERE u_Name=p_Owner AND p_Image_Url LIKE #{Album}")
		List <BaseImage> getCoverImageByAlbum(String Album);
	
	
	
	
	
	
	
	
	
	
	
}
