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
 * 院系信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-19 16:32:30
 */
@TableName("yuanxixinxi")
public class YuanxixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuanxixinxiEntity() {
		
	}
	
	public YuanxixinxiEntity(T t) {
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
	 * 院系名称
	 */
					
	private String yuanximingcheng;
	
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
	 * 设置：院系名称
	 */
	public void setYuanximingcheng(String yuanximingcheng) {
		this.yuanximingcheng = yuanximingcheng;
	}
	/**
	 * 获取：院系名称
	 */
	public String getYuanximingcheng() {
		return yuanximingcheng;
	}
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
