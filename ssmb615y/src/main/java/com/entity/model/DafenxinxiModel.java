package com.entity.model;

import com.entity.DafenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 打分信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public class DafenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文档名称
	 */
	
	private String wendangmingcheng;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 发布日期
	 */
	
	private String faburiqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 学生文档
	 */
	
	private String xueshengwendang;
		
	/**
	 * 打分
	 */
	
	private Integer dafen;
		
	/**
	 * 评分日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingfenriqi;
				
	
	/**
	 * 设置：文档名称
	 */
	 
	public void setWendangmingcheng(String wendangmingcheng) {
		this.wendangmingcheng = wendangmingcheng;
	}
	
	/**
	 * 获取：文档名称
	 */
	public String getWendangmingcheng() {
		return wendangmingcheng;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(String faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public String getFaburiqi() {
		return faburiqi;
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
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：学生文档
	 */
	 
	public void setXueshengwendang(String xueshengwendang) {
		this.xueshengwendang = xueshengwendang;
	}
	
	/**
	 * 获取：学生文档
	 */
	public String getXueshengwendang() {
		return xueshengwendang;
	}
				
	
	/**
	 * 设置：打分
	 */
	 
	public void setDafen(Integer dafen) {
		this.dafen = dafen;
	}
	
	/**
	 * 获取：打分
	 */
	public Integer getDafen() {
		return dafen;
	}
				
	
	/**
	 * 设置：评分日期
	 */
	 
	public void setPingfenriqi(Date pingfenriqi) {
		this.pingfenriqi = pingfenriqi;
	}
	
	/**
	 * 获取：评分日期
	 */
	public Date getPingfenriqi() {
		return pingfenriqi;
	}
			
}
