package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangchuanwendangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangchuanwendangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangchuanwendangView;


/**
 * 上传文档
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface ShangchuanwendangService extends IService<ShangchuanwendangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangchuanwendangVO> selectListVO(Wrapper<ShangchuanwendangEntity> wrapper);
   	
   	ShangchuanwendangVO selectVO(@Param("ew") Wrapper<ShangchuanwendangEntity> wrapper);
   	
   	List<ShangchuanwendangView> selectListView(Wrapper<ShangchuanwendangEntity> wrapper);
   	
   	ShangchuanwendangView selectView(@Param("ew") Wrapper<ShangchuanwendangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangchuanwendangEntity> wrapper);
   	
}

