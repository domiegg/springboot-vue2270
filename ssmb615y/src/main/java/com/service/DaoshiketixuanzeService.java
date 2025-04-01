package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaoshiketixuanzeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaoshiketixuanzeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaoshiketixuanzeView;


/**
 * 导师课题选择
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface DaoshiketixuanzeService extends IService<DaoshiketixuanzeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaoshiketixuanzeVO> selectListVO(Wrapper<DaoshiketixuanzeEntity> wrapper);
   	
   	DaoshiketixuanzeVO selectVO(@Param("ew") Wrapper<DaoshiketixuanzeEntity> wrapper);
   	
   	List<DaoshiketixuanzeView> selectListView(Wrapper<DaoshiketixuanzeEntity> wrapper);
   	
   	DaoshiketixuanzeView selectView(@Param("ew") Wrapper<DaoshiketixuanzeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaoshiketixuanzeEntity> wrapper);
   	
}

