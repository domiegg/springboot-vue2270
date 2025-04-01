package com.entity.view;

import com.entity.TichuyiwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 提出疑问
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
@TableName("tichuyiwen")
public class TichuyiwenView  extends TichuyiwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TichuyiwenView(){
	}
 
 	public TichuyiwenView(TichuyiwenEntity tichuyiwenEntity){
 	try {
			BeanUtils.copyProperties(this, tichuyiwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
