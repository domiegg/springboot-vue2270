package com.entity.model;

import com.entity.JiaoshiketixuanzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教师课题选择
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public class JiaoshiketixuanzeModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课题名称
	 */
	
	private String ketimingcheng;
		
	/**
	 * 难度
	 */
	
	private String nandu;
		
	/**
	 * 来源
	 */
	
	private String laiyuan;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 描述
	 */
	
	private String miaoshu;
		
	/**
	 * 课程资料
	 */
	
	private String kechengziliao;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：课题名称
	 */
	 
	public void setKetimingcheng(String ketimingcheng) {
		this.ketimingcheng = ketimingcheng;
	}
	
	/**
	 * 获取：课题名称
	 */
	public String getKetimingcheng() {
		return ketimingcheng;
	}
				
	
	/**
	 * 设置：难度
	 */
	 
	public void setNandu(String nandu) {
		this.nandu = nandu;
	}
	
	/**
	 * 获取：难度
	 */
	public String getNandu() {
		return nandu;
	}
				
	
	/**
	 * 设置：来源
	 */
	 
	public void setLaiyuan(String laiyuan) {
		this.laiyuan = laiyuan;
	}
	
	/**
	 * 获取：来源
	 */
	public String getLaiyuan() {
		return laiyuan;
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
	 * 设置：描述
	 */
	 
	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}
	
	/**
	 * 获取：描述
	 */
	public String getMiaoshu() {
		return miaoshu;
	}
				
	
	/**
	 * 设置：课程资料
	 */
	 
	public void setKechengziliao(String kechengziliao) {
		this.kechengziliao = kechengziliao;
	}
	
	/**
	 * 获取：课程资料
	 */
	public String getKechengziliao() {
		return kechengziliao;
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
