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


import com.dao.LeixingxinxiDao;
import com.entity.LeixingxinxiEntity;
import com.service.LeixingxinxiService;
import com.entity.vo.LeixingxinxiVO;
import com.entity.view.LeixingxinxiView;

@Service("leixingxinxiService")
public class LeixingxinxiServiceImpl extends ServiceImpl<LeixingxinxiDao, LeixingxinxiEntity> implements LeixingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LeixingxinxiEntity> page = this.selectPage(
                new Query<LeixingxinxiEntity>(params).getPage(),
                new EntityWrapper<LeixingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LeixingxinxiEntity> wrapper) {
		  Page<LeixingxinxiView> page =new Query<LeixingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LeixingxinxiVO> selectListVO(Wrapper<LeixingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LeixingxinxiVO selectVO(Wrapper<LeixingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LeixingxinxiView> selectListView(Wrapper<LeixingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LeixingxinxiView selectView(Wrapper<LeixingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
