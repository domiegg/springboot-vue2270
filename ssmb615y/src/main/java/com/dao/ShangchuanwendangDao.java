package com.dao;

import com.entity.ShangchuanwendangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangchuanwendangVO;
import com.entity.view.ShangchuanwendangView;


/**
 * 上传文档
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface ShangchuanwendangDao extends BaseMapper<ShangchuanwendangEntity> {
	
	List<ShangchuanwendangVO> selectListVO(@Param("ew") Wrapper<ShangchuanwendangEntity> wrapper);
	
	ShangchuanwendangVO selectVO(@Param("ew") Wrapper<ShangchuanwendangEntity> wrapper);
	
	List<ShangchuanwendangView> selectListView(@Param("ew") Wrapper<ShangchuanwendangEntity> wrapper);

	List<ShangchuanwendangView> selectListView(Pagination page,@Param("ew") Wrapper<ShangchuanwendangEntity> wrapper);
	
	ShangchuanwendangView selectView(@Param("ew") Wrapper<ShangchuanwendangEntity> wrapper);
	
}
