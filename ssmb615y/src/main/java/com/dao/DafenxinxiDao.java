package com.dao;

import com.entity.DafenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DafenxinxiVO;
import com.entity.view.DafenxinxiView;


/**
 * 打分信息
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface DafenxinxiDao extends BaseMapper<DafenxinxiEntity> {
	
	List<DafenxinxiVO> selectListVO(@Param("ew") Wrapper<DafenxinxiEntity> wrapper);
	
	DafenxinxiVO selectVO(@Param("ew") Wrapper<DafenxinxiEntity> wrapper);
	
	List<DafenxinxiView> selectListView(@Param("ew") Wrapper<DafenxinxiEntity> wrapper);

	List<DafenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DafenxinxiEntity> wrapper);
	
	DafenxinxiView selectView(@Param("ew") Wrapper<DafenxinxiEntity> wrapper);
	
}
