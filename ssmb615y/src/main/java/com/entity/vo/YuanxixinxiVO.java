package com.entity.vo;

import com.entity.YuanxixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 院系信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-19 16:32:30
 */
public class YuanxixinxiVO  implements Serializable {
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
