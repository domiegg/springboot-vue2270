package com.dao;

import com.entity.WendangfabuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WendangfabuVO;
import com.entity.view.WendangfabuView;


/**
 * 文档发布
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface WendangfabuDao extends BaseMapper<WendangfabuEntity> {
	
	List<WendangfabuVO> selectListVO(@Param("ew") Wrapper<WendangfabuEntity> wrapper);
	
	WendangfabuVO selectVO(@Param("ew") Wrapper<WendangfabuEntity> wrapper);
	
	List<WendangfabuView> selectListView(@Param("ew") Wrapper<WendangfabuEntity> wrapper);

	List<WendangfabuView> selectListView(Pagination page,@Param("ew") Wrapper<WendangfabuEntity> wrapper);
	
	WendangfabuView selectView(@Param("ew") Wrapper<WendangfabuEntity> wrapper);
	
}
