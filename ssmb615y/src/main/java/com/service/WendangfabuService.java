package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WendangfabuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WendangfabuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WendangfabuView;


/**
 * 文档发布
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface WendangfabuService extends IService<WendangfabuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WendangfabuVO> selectListVO(Wrapper<WendangfabuEntity> wrapper);
   	
   	WendangfabuVO selectVO(@Param("ew") Wrapper<WendangfabuEntity> wrapper);
   	
   	List<WendangfabuView> selectListView(Wrapper<WendangfabuEntity> wrapper);
   	
   	WendangfabuView selectView(@Param("ew") Wrapper<WendangfabuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WendangfabuEntity> wrapper);
   	
}

