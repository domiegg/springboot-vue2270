package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DabianmingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DabianmingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DabianmingdanView;


/**
 * 答辩名单
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface DabianmingdanService extends IService<DabianmingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DabianmingdanVO> selectListVO(Wrapper<DabianmingdanEntity> wrapper);
   	
   	DabianmingdanVO selectVO(@Param("ew") Wrapper<DabianmingdanEntity> wrapper);
   	
   	List<DabianmingdanView> selectListView(Wrapper<DabianmingdanEntity> wrapper);
   	
   	DabianmingdanView selectView(@Param("ew") Wrapper<DabianmingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DabianmingdanEntity> wrapper);
   	
}

