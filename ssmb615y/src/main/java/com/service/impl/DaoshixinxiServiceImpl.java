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


import com.dao.DaoshixinxiDao;
import com.entity.DaoshixinxiEntity;
import com.service.DaoshixinxiService;
import com.entity.vo.DaoshixinxiVO;
import com.entity.view.DaoshixinxiView;

@Service("daoshixinxiService")
public class DaoshixinxiServiceImpl extends ServiceImpl<DaoshixinxiDao, DaoshixinxiEntity> implements DaoshixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaoshixinxiEntity> page = this.selectPage(
                new Query<DaoshixinxiEntity>(params).getPage(),
                new EntityWrapper<DaoshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaoshixinxiEntity> wrapper) {
		  Page<DaoshixinxiView> page =new Query<DaoshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaoshixinxiVO> selectListVO(Wrapper<DaoshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaoshixinxiVO selectVO(Wrapper<DaoshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaoshixinxiView> selectListView(Wrapper<DaoshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaoshixinxiView selectView(Wrapper<DaoshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
