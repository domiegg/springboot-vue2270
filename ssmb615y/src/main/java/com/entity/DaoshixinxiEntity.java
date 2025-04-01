package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 导师信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
@TableName("daoshixinxi")
public class DaoshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DaoshixinxiEntity() {
		
	}
	
	public DaoshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 导师账号
	 */
					
	private String daoshizhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：导师账号
	 */
	public void setDaoshizhanghao(String daoshizhanghao) {
		this.daoshizhanghao = daoshizhanghao;
	}
	/**
	 * 获取：导师账号
	 */
	public String getDaoshizhanghao() {
		return daoshizhanghao;
	}
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
