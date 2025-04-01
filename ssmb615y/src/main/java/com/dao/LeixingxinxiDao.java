package com.dao;

import com.entity.LeixingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LeixingxinxiVO;
import com.entity.view.LeixingxinxiView;


/**
 * 类型信息
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface LeixingxinxiDao extends BaseMapper<LeixingxinxiEntity> {
	
	List<LeixingxinxiVO> selectListVO(@Param("ew") Wrapper<LeixingxinxiEntity> wrapper);
	
	LeixingxinxiVO selectVO(@Param("ew") Wrapper<LeixingxinxiEntity> wrapper);
	
	List<LeixingxinxiView> selectListView(@Param("ew") Wrapper<LeixingxinxiEntity> wrapper);

	List<LeixingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LeixingxinxiEntity> wrapper);
	
	LeixingxinxiView selectView(@Param("ew") Wrapper<LeixingxinxiEntity> wrapper);
	
}
