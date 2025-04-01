package com.dao;

import com.entity.JiaoshiketixuanzeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshiketixuanzeVO;
import com.entity.view.JiaoshiketixuanzeView;


/**
 * 教师课题选择
 * 
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
public interface JiaoshiketixuanzeDao extends BaseMapper<JiaoshiketixuanzeEntity> {
	
	List<JiaoshiketixuanzeVO> selectListVO(@Param("ew") Wrapper<JiaoshiketixuanzeEntity> wrapper);
	
	JiaoshiketixuanzeVO selectVO(@Param("ew") Wrapper<JiaoshiketixuanzeEntity> wrapper);
	
	List<JiaoshiketixuanzeView> selectListView(@Param("ew") Wrapper<JiaoshiketixuanzeEntity> wrapper);

	List<JiaoshiketixuanzeView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshiketixuanzeEntity> wrapper);
	
	JiaoshiketixuanzeView selectView(@Param("ew") Wrapper<JiaoshiketixuanzeEntity> wrapper);
	
}
