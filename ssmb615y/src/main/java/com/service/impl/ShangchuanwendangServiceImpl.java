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


import com.dao.ShangchuanwendangDao;
import com.entity.ShangchuanwendangEntity;
import com.service.ShangchuanwendangService;
import com.entity.vo.ShangchuanwendangVO;
import com.entity.view.ShangchuanwendangView;

@Service("shangchuanwendangService")
public class ShangchuanwendangServiceImpl extends ServiceImpl<ShangchuanwendangDao, ShangchuanwendangEntity> implements ShangchuanwendangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangchuanwendangEntity> page = this.selectPage(
                new Query<ShangchuanwendangEntity>(params).getPage(),
                new EntityWrapper<ShangchuanwendangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangchuanwendangEntity> wrapper) {
		  Page<ShangchuanwendangView> page =new Query<ShangchuanwendangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangchuanwendangVO> selectListVO(Wrapper<ShangchuanwendangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangchuanwendangVO selectVO(Wrapper<ShangchuanwendangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangchuanwendangView> selectListView(Wrapper<ShangchuanwendangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangchuanwendangView selectView(Wrapper<ShangchuanwendangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
