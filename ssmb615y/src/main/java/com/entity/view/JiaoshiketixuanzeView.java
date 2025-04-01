package com.entity.view;

import com.entity.JiaoshiketixuanzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师课题选择
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
@TableName("jiaoshiketixuanze")
public class JiaoshiketixuanzeView  extends JiaoshiketixuanzeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshiketixuanzeView(){
	}
 
 	public JiaoshiketixuanzeView(JiaoshiketixuanzeEntity jiaoshiketixuanzeEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshiketixuanzeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
