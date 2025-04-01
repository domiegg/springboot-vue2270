package com.entity.view;

import com.entity.ShangchuanwendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 上传文档
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
@TableName("shangchuanwendang")
public class ShangchuanwendangView  extends ShangchuanwendangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangchuanwendangView(){
	}
 
 	public ShangchuanwendangView(ShangchuanwendangEntity shangchuanwendangEntity){
 	try {
			BeanUtils.copyProperties(this, shangchuanwendangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
