package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingketiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingketiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingketiView;


/**
 * 申请课题
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface ShenqingketiService extends IService<ShenqingketiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingketiVO> selectListVO(Wrapper<ShenqingketiEntity> wrapper);
   	
   	ShenqingketiVO selectVO(@Param("ew") Wrapper<ShenqingketiEntity> wrapper);
   	
   	List<ShenqingketiView> selectListView(Wrapper<ShenqingketiEntity> wrapper);
   	
   	ShenqingketiView selectView(@Param("ew") Wrapper<ShenqingketiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingketiEntity> wrapper);
   	
}

