package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshiketixuanzeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshiketixuanzeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiketixuanzeView;


/**
 * 教师课题选择
 *
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface JiaoshiketixuanzeService extends IService<JiaoshiketixuanzeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshiketixuanzeVO> selectListVO(Wrapper<JiaoshiketixuanzeEntity> wrapper);
   	
   	JiaoshiketixuanzeVO selectVO(@Param("ew") Wrapper<JiaoshiketixuanzeEntity> wrapper);
   	
   	List<JiaoshiketixuanzeView> selectListView(Wrapper<JiaoshiketixuanzeEntity> wrapper);
   	
   	JiaoshiketixuanzeView selectView(@Param("ew") Wrapper<JiaoshiketixuanzeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshiketixuanzeEntity> wrapper);
   	
}

