package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianlunwenshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianlunwenshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianlunwenshenqingView;


/**
 * 免论文申请
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface MianlunwenshenqingService extends IService<MianlunwenshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianlunwenshenqingVO> selectListVO(Wrapper<MianlunwenshenqingEntity> wrapper);
   	
   	MianlunwenshenqingVO selectVO(@Param("ew") Wrapper<MianlunwenshenqingEntity> wrapper);
   	
   	List<MianlunwenshenqingView> selectListView(Wrapper<MianlunwenshenqingEntity> wrapper);
   	
   	MianlunwenshenqingView selectView(@Param("ew") Wrapper<MianlunwenshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianlunwenshenqingEntity> wrapper);
   	
}

