package com.forum.service;

import java.util.List;

import com.forum.pojo.BaseBlog;
import com.forum.pojo.BaseDetails;
import com.forum.pojo.BaseImage;
/**
 * Service 层 用来书写对外的接口  Service impl 接口用于 创建Mapper对象  调用中实现好的方法
 * 使用Mapper  完成对 Service 层方法的实现
 * @author root
 *
 */
public interface BaseImageService {
	/**
	 * 用户主页
	 * 
	 * 根据用户名
	 * 查询 该用户下的所有图片
	 * 		
	 */
List<BaseBlog> getImageByUserName(String u_UserName);
	/**
	 * 
	 * 查看图片页
	 * 
	 * 根据用户名和相册名(相册名从前页传入)
	 * 查询  
	 * 该用户下的该相册
	 * 
	 */
	List<String> //尝试传入一个BaseDetail的参数 研究依赖注入 和工厂模式 和 mvc 
	getAlbumByUserName(String p_Image_Url);
	
	
	
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
