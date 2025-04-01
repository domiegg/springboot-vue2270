package com.dao;

import com.entity.TiwenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiwenxinxiVO;
import com.entity.view.TiwenxinxiView;


/**
 * 提问信息
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface TiwenxinxiDao extends BaseMapper<TiwenxinxiEntity> {
	
	List<TiwenxinxiVO> selectListVO(@Param("ew") Wrapper<TiwenxinxiEntity> wrapper);
	
	TiwenxinxiVO selectVO(@Param("ew") Wrapper<TiwenxinxiEntity> wrapper);
	
	List<TiwenxinxiView> selectListView(@Param("ew") Wrapper<TiwenxinxiEntity> wrapper);

	List<TiwenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TiwenxinxiEntity> wrapper);
	
	TiwenxinxiView selectView(@Param("ew") Wrapper<TiwenxinxiEntity> wrapper);
	
}
