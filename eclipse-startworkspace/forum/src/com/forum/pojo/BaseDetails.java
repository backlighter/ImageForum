package com.forum.pojo;

import java.util.List;

public class BaseDetails {
	
	private String p_Describe;
	private List<String> p_Image_Url;
	private String p_Tags;
	private String u_Name;
	private String u_Image;
	public String getP_Describe() {
		return p_Describe;
	}
	public void setP_Describe(String p_Describe) {
		this.p_Describe = p_Describe;
	}
	
	
	public String getP_Tags() {
		return p_Tags;
	}
	public List<String> getP_Image_Url() {
		return p_Image_Url;
	}
	public void setP_Image_Url(List<String> p_Image_Url) {
		this.p_Image_Url = p_Image_Url;
	}
	public void setP_Tags(String p_Tags) {
		this.p_Tags = p_Tags;
	}
	public String getU_Name() {
		return u_Name;
	}
	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}
	public String getU_Image() {
		return u_Image;
	}
	public void setU_Image(String u_Image) {
		this.u_Image = u_Image;
	}
	@Override
	public String toString() {
		return "{\"p_Describe\":\"" + p_Describe + "\",\"p_Image_Url\":\"" + p_Image_Url + "\",\"p_Tags\":\"" + p_Tags
				+ "\",\"u_Name\":\"" + u_Name + "\",\"u_Image\":\"" + u_Image + "\"}";
	}
}
