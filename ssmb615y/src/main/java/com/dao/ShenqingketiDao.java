package com.dao;

import com.entity.ShenqingketiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingketiVO;
import com.entity.view.ShenqingketiView;


/**
 * 申请课题
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface ShenqingketiDao extends BaseMapper<ShenqingketiEntity> {
	
	List<ShenqingketiVO> selectListVO(@Param("ew") Wrapper<ShenqingketiEntity> wrapper);
	
	ShenqingketiVO selectVO(@Param("ew") Wrapper<ShenqingketiEntity> wrapper);
	
	List<ShenqingketiView> selectListView(@Param("ew") Wrapper<ShenqingketiEntity> wrapper);

	List<ShenqingketiView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingketiEntity> wrapper);
	
	ShenqingketiView selectView(@Param("ew") Wrapper<ShenqingketiEntity> wrapper);
	
}
