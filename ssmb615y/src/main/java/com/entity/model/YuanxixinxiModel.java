package com.entity.model;

import com.entity.YuanxixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 院系信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 16:32:30
 */
public class YuanxixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教学院长
	 */
	
	private String jiaoxueyuanzhang;
		
	/**
	 * 教学秘书
	 */
	
	private String jiaoxuemishu;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
				
	
	/**
	 * 设置：教学院长
	 */
	 
	public void setJiaoxueyuanzhang(String jiaoxueyuanzhang) {
		this.jiaoxueyuanzhang = jiaoxueyuanzhang;
	}
	
	/**
	 * 获取：教学院长
	 */
	public String getJiaoxueyuanzhang() {
		return jiaoxueyuanzhang;
	}
				
	
	/**
	 * 设置：教学秘书
	 */
	 
	public void setJiaoxuemishu(String jiaoxuemishu) {
		this.jiaoxuemishu = jiaoxuemishu;
	}
	
	/**
	 * 获取：教学秘书
	 */
	public String getJiaoxuemishu() {
		return jiaoxuemishu;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
			
}
