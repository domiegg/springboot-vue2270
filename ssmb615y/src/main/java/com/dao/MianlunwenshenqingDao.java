package com.dao;

import com.entity.MianlunwenshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianlunwenshenqingVO;
import com.entity.view.MianlunwenshenqingView;


/**
 * 免论文申请
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface MianlunwenshenqingDao extends BaseMapper<MianlunwenshenqingEntity> {
	
	List<MianlunwenshenqingVO> selectListVO(@Param("ew") Wrapper<MianlunwenshenqingEntity> wrapper);
	
	MianlunwenshenqingVO selectVO(@Param("ew") Wrapper<MianlunwenshenqingEntity> wrapper);
	
	List<MianlunwenshenqingView> selectListView(@Param("ew") Wrapper<MianlunwenshenqingEntity> wrapper);

	List<MianlunwenshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<MianlunwenshenqingEntity> wrapper);
	
	MianlunwenshenqingView selectView(@Param("ew") Wrapper<MianlunwenshenqingEntity> wrapper);
	
}
