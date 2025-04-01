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


import com.dao.WendangfabuDao;
import com.entity.WendangfabuEntity;
import com.service.WendangfabuService;
import com.entity.vo.WendangfabuVO;
import com.entity.view.WendangfabuView;

@Service("wendangfabuService")
public class WendangfabuServiceImpl extends ServiceImpl<WendangfabuDao, WendangfabuEntity> implements WendangfabuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WendangfabuEntity> page = this.selectPage(
                new Query<WendangfabuEntity>(params).getPage(),
                new EntityWrapper<WendangfabuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WendangfabuEntity> wrapper) {
		  Page<WendangfabuView> page =new Query<WendangfabuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WendangfabuVO> selectListVO(Wrapper<WendangfabuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WendangfabuVO selectVO(Wrapper<WendangfabuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WendangfabuView> selectListView(Wrapper<WendangfabuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WendangfabuView selectView(Wrapper<WendangfabuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
