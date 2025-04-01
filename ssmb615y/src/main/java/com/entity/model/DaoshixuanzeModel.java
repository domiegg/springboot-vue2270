package com.entity.model;

import com.entity.DaoshixuanzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 导师选择
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public class DaoshixuanzeModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 导师姓名
	 */
	
	private String daoshixingming;
		
	/**
	 * 选择
	 */
	
	private String xuanze;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 申请日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
				
	
	/**
	 * 设置：导师姓名
	 */
	 
	public void setDaoshixingming(String daoshixingming) {
		this.daoshixingming = daoshixingming;
	}
	
	/**
	 * 获取：导师姓名
	 */
	public String getDaoshixingming() {
		return daoshixingming;
	}
				
	
	/**
	 * 设置：选择
	 */
	 
	public void setXuanze(String xuanze) {
		this.xuanze = xuanze;
	}
	
	/**
	 * 获取：选择
	 */
	public String getXuanze() {
		return xuanze;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
			
}
