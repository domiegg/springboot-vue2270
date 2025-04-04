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
 * 打分信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
@TableName("dafenxinxi")
public class DafenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DafenxinxiEntity() {
		
	}
	
	public DafenxinxiEntity(T t) {
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
	 * 文档编号
	 */
					
	private String wendangbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pingfenriqi;
	
	
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
	 * 设置：文档编号
	 */
	public void setWendangbianhao(String wendangbianhao) {
		this.wendangbianhao = wendangbianhao;
	}
	/**
	 * 获取：文档编号
	 */
	public String getWendangbianhao() {
		return wendangbianhao;
	}
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
