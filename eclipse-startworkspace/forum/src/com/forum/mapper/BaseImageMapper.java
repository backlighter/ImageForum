package com.forum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.forum.pojo.BaseBlog;
import com.forum.pojo.BaseDetails;
import com.forum.pojo.BaseImage;
import com.forum.pojo.User;
/**
 * Mapper层 用于实现 数据库一些基础的数据库方法
 * 用于Serviceimpl  实现层调用 
 * @author root
 *
 */
@Repository
public interface BaseImageMapper {
	/**
	 * 用户主页
	 * 
	 * 根据用户名
	 * 查询 该用户下的所有图片
	 * 		
	 */
	@Select("SELECT p_Describe,p_Image_Url,p_Tags,u_Name,u_Image FROM pic,user WHERE u_Name=p_Owner AND\r\n" + 
			"u_Name=#{u_Name}")
	List <BaseBlog> getImageByUserName(String u_UserName);
	
	/**
	 * 
	 * 查看图片页
	 * 
	 * 根据用户名和相册名(相册名从前页传入)
	 * 查询  
	 * 该用户下的该相册中的图片
	 * 
	 */
	@Select("SELECT p_Image_Url FROM pic WHERE p_Image_Url LIKE #{p_Image_Url}")
	List<String> getAlbumByUserName(String p_Image_Url);
	/**
	 * 拿到用户的用户名 和 用户图片 用户Email 
	 */
	@Select("SELECT u_Name,u_Image,u_Emai FROM user WHERE u_Name=#{u_Name}")
	List <User> getUserMessage(String u_Name);
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
