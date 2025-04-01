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


import com.dao.DaoshixuanzeDao;
import com.entity.DaoshixuanzeEntity;
import com.service.DaoshixuanzeService;
import com.entity.vo.DaoshixuanzeVO;
import com.entity.view.DaoshixuanzeView;

@Service("daoshixuanzeService")
public class DaoshixuanzeServiceImpl extends ServiceImpl<DaoshixuanzeDao, DaoshixuanzeEntity> implements DaoshixuanzeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaoshixuanzeEntity> page = this.selectPage(
                new Query<DaoshixuanzeEntity>(params).getPage(),
                new EntityWrapper<DaoshixuanzeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaoshixuanzeEntity> wrapper) {
		  Page<DaoshixuanzeView> page =new Query<DaoshixuanzeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaoshixuanzeVO> selectListVO(Wrapper<DaoshixuanzeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaoshixuanzeVO selectVO(Wrapper<DaoshixuanzeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaoshixuanzeView> selectListView(Wrapper<DaoshixuanzeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaoshixuanzeView selectView(Wrapper<DaoshixuanzeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
