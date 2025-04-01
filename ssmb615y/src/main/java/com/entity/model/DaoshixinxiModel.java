package com.entity.model;

import com.entity.DaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 导师信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public class DaoshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 导师姓名
	 */
	
	private String daoshixingming;
		
	/**
	 * 所属专业
	 */
	
	private String suoshuzhuanye;
		
	/**
	 * 可指导专业
	 */
	
	private String kezhidaozhuanye;
		
	/**
	 * 研究方向
	 */
	
	private String yanjiufangxiang;
		
	/**
	 * 最高学历
	 */
	
	private String zuigaoxueli;
		
	/**
	 * 最高学位
	 */
	
	private String zuigaoxuewei;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：所属专业
	 */
	 
	public void setSuoshuzhuanye(String suoshuzhuanye) {
		this.suoshuzhuanye = suoshuzhuanye;
	}
	
	/**
	 * 获取：所属专业
	 */
	public String getSuoshuzhuanye() {
		return suoshuzhuanye;
	}
				
	
	/**
	 * 设置：可指导专业
	 */
	 
	public void setKezhidaozhuanye(String kezhidaozhuanye) {
		this.kezhidaozhuanye = kezhidaozhuanye;
	}
	
	/**
	 * 获取：可指导专业
	 */
	public String getKezhidaozhuanye() {
		return kezhidaozhuanye;
	}
				
	
	/**
	 * 设置：研究方向
	 */
	 
	public void setYanjiufangxiang(String yanjiufangxiang) {
		this.yanjiufangxiang = yanjiufangxiang;
	}
	
	/**
	 * 获取：研究方向
	 */
	public String getYanjiufangxiang() {
		return yanjiufangxiang;
	}
				
	
	/**
	 * 设置：最高学历
	 */
	 
	public void setZuigaoxueli(String zuigaoxueli) {
		this.zuigaoxueli = zuigaoxueli;
	}
	
	/**
	 * 获取：最高学历
	 */
	public String getZuigaoxueli() {
		return zuigaoxueli;
	}
				
	
	/**
	 * 设置：最高学位
	 */
	 
	public void setZuigaoxuewei(String zuigaoxuewei) {
		this.zuigaoxuewei = zuigaoxuewei;
	}
	
	/**
	 * 获取：最高学位
	 */
	public String getZuigaoxuewei() {
		return zuigaoxuewei;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
