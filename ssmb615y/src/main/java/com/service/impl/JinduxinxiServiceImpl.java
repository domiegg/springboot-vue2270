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


import com.dao.JinduxinxiDao;
import com.entity.JinduxinxiEntity;
import com.service.JinduxinxiService;
import com.entity.vo.JinduxinxiVO;
import com.entity.view.JinduxinxiView;

@Service("jinduxinxiService")
public class JinduxinxiServiceImpl extends ServiceImpl<JinduxinxiDao, JinduxinxiEntity> implements JinduxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinduxinxiEntity> page = this.selectPage(
                new Query<JinduxinxiEntity>(params).getPage(),
                new EntityWrapper<JinduxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinduxinxiEntity> wrapper) {
		  Page<JinduxinxiView> page =new Query<JinduxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinduxinxiVO> selectListVO(Wrapper<JinduxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinduxinxiVO selectVO(Wrapper<JinduxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinduxinxiView> selectListView(Wrapper<JinduxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinduxinxiView selectView(Wrapper<JinduxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
