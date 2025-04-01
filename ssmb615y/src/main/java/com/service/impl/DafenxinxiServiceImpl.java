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


import com.dao.DafenxinxiDao;
import com.entity.DafenxinxiEntity;
import com.service.DafenxinxiService;
import com.entity.vo.DafenxinxiVO;
import com.entity.view.DafenxinxiView;

@Service("dafenxinxiService")
public class DafenxinxiServiceImpl extends ServiceImpl<DafenxinxiDao, DafenxinxiEntity> implements DafenxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DafenxinxiEntity> page = this.selectPage(
                new Query<DafenxinxiEntity>(params).getPage(),
                new EntityWrapper<DafenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DafenxinxiEntity> wrapper) {
		  Page<DafenxinxiView> page =new Query<DafenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DafenxinxiVO> selectListVO(Wrapper<DafenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DafenxinxiVO selectVO(Wrapper<DafenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DafenxinxiView> selectListView(Wrapper<DafenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DafenxinxiView selectView(Wrapper<DafenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
