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


import com.dao.TiwenxinxiDao;
import com.entity.TiwenxinxiEntity;
import com.service.TiwenxinxiService;
import com.entity.vo.TiwenxinxiVO;
import com.entity.view.TiwenxinxiView;

@Service("tiwenxinxiService")
public class TiwenxinxiServiceImpl extends ServiceImpl<TiwenxinxiDao, TiwenxinxiEntity> implements TiwenxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiwenxinxiEntity> page = this.selectPage(
                new Query<TiwenxinxiEntity>(params).getPage(),
                new EntityWrapper<TiwenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiwenxinxiEntity> wrapper) {
		  Page<TiwenxinxiView> page =new Query<TiwenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiwenxinxiVO> selectListVO(Wrapper<TiwenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiwenxinxiVO selectVO(Wrapper<TiwenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiwenxinxiView> selectListView(Wrapper<TiwenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiwenxinxiView selectView(Wrapper<TiwenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
