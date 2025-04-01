package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TichuyiwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TichuyiwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TichuyiwenView;


/**
 * 提出疑问
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface TichuyiwenService extends IService<TichuyiwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TichuyiwenVO> selectListVO(Wrapper<TichuyiwenEntity> wrapper);
   	
   	TichuyiwenVO selectVO(@Param("ew") Wrapper<TichuyiwenEntity> wrapper);
   	
   	List<TichuyiwenView> selectListView(Wrapper<TichuyiwenEntity> wrapper);
   	
   	TichuyiwenView selectView(@Param("ew") Wrapper<TichuyiwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TichuyiwenEntity> wrapper);
   	
}

