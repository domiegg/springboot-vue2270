package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiwenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiwenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiwenxinxiView;


/**
 * 提问信息
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface TiwenxinxiService extends IService<TiwenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiwenxinxiVO> selectListVO(Wrapper<TiwenxinxiEntity> wrapper);
   	
   	TiwenxinxiVO selectVO(@Param("ew") Wrapper<TiwenxinxiEntity> wrapper);
   	
   	List<TiwenxinxiView> selectListView(Wrapper<TiwenxinxiEntity> wrapper);
   	
   	TiwenxinxiView selectView(@Param("ew") Wrapper<TiwenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiwenxinxiEntity> wrapper);
   	
}

