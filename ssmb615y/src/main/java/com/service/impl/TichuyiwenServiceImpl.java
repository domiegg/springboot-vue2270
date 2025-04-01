package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TichuyiwenDao;
import com.entity.TichuyiwenEntity;
import com.service.TichuyiwenService;
import com.entity.vo.TichuyiwenVO;
import com.entity.view.TichuyiwenView;

@Service("tichuyiwenService")
public class TichuyiwenServiceImpl extends ServiceImpl<TichuyiwenDao, TichuyiwenEntity> implements TichuyiwenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TichuyiwenEntity> page = this.selectPage(
                new Query<TichuyiwenEntity>(params).getPage(),
                new EntityWrapper<TichuyiwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TichuyiwenEntity> wrapper) {
		  Page<TichuyiwenView> page =new Query<TichuyiwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TichuyiwenVO> selectListVO(Wrapper<TichuyiwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TichuyiwenVO selectVO(Wrapper<TichuyiwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TichuyiwenView> selectListView(Wrapper<TichuyiwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TichuyiwenView selectView(Wrapper<TichuyiwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
