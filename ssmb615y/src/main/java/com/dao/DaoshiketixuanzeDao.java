package com.dao;

import com.entity.DaoshiketixuanzeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaoshiketixuanzeVO;
import com.entity.view.DaoshiketixuanzeView;


/**
 * 导师课题选择
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface DaoshiketixuanzeDao extends BaseMapper<DaoshiketixuanzeEntity> {
	
	List<DaoshiketixuanzeVO> selectListVO(@Param("ew") Wrapper<DaoshiketixuanzeEntity> wrapper);
	
	DaoshiketixuanzeVO selectVO(@Param("ew") Wrapper<DaoshiketixuanzeEntity> wrapper);
	
	List<DaoshiketixuanzeView> selectListView(@Param("ew") Wrapper<DaoshiketixuanzeEntity> wrapper);

	List<DaoshiketixuanzeView> selectListView(Pagination page,@Param("ew") Wrapper<DaoshiketixuanzeEntity> wrapper);
	
	DaoshiketixuanzeView selectView(@Param("ew") Wrapper<DaoshiketixuanzeEntity> wrapper);
	
}
