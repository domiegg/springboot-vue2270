package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DafenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DafenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DafenxinxiView;


/**
 * 打分信息
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface DafenxinxiService extends IService<DafenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DafenxinxiVO> selectListVO(Wrapper<DafenxinxiEntity> wrapper);
   	
   	DafenxinxiVO selectVO(@Param("ew") Wrapper<DafenxinxiEntity> wrapper);
   	
   	List<DafenxinxiView> selectListView(Wrapper<DafenxinxiEntity> wrapper);
   	
   	DafenxinxiView selectView(@Param("ew") Wrapper<DafenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DafenxinxiEntity> wrapper);
   	
}

