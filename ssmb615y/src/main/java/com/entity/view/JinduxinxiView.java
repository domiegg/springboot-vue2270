package com.entity.view;

import com.entity.JinduxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 进度信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
@TableName("jinduxinxi")
public class JinduxinxiView  extends JinduxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinduxinxiView(){
	}
 
 	public JinduxinxiView(JinduxinxiEntity jinduxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jinduxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
