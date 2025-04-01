package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeixingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeixingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeixingxinxiView;


/**
 * 类型信息
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface LeixingxinxiService extends IService<LeixingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeixingxinxiVO> selectListVO(Wrapper<LeixingxinxiEntity> wrapper);
   	
   	LeixingxinxiVO selectVO(@Param("ew") Wrapper<LeixingxinxiEntity> wrapper);
   	
   	List<LeixingxinxiView> selectListView(Wrapper<LeixingxinxiEntity> wrapper);
   	
   	LeixingxinxiView selectView(@Param("ew") Wrapper<LeixingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeixingxinxiEntity> wrapper);
   	
}

