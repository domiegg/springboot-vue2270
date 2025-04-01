package com.dao;

import com.entity.TichuyiwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TichuyiwenVO;
import com.entity.view.TichuyiwenView;


/**
 * 提出疑问
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface TichuyiwenDao extends BaseMapper<TichuyiwenEntity> {
	
	List<TichuyiwenVO> selectListVO(@Param("ew") Wrapper<TichuyiwenEntity> wrapper);
	
	TichuyiwenVO selectVO(@Param("ew") Wrapper<TichuyiwenEntity> wrapper);
	
	List<TichuyiwenView> selectListView(@Param("ew") Wrapper<TichuyiwenEntity> wrapper);

	List<TichuyiwenView> selectListView(Pagination page,@Param("ew") Wrapper<TichuyiwenEntity> wrapper);
	
	TichuyiwenView selectView(@Param("ew") Wrapper<TichuyiwenEntity> wrapper);
	
}
