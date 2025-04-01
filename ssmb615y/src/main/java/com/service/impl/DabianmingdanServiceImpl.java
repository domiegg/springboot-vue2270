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


import com.dao.DabianmingdanDao;
import com.entity.DabianmingdanEntity;
import com.service.DabianmingdanService;
import com.entity.vo.DabianmingdanVO;
import com.entity.view.DabianmingdanView;

@Service("dabianmingdanService")
public class DabianmingdanServiceImpl extends ServiceImpl<DabianmingdanDao, DabianmingdanEntity> implements DabianmingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DabianmingdanEntity> page = this.selectPage(
                new Query<DabianmingdanEntity>(params).getPage(),
                new EntityWrapper<DabianmingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DabianmingdanEntity> wrapper) {
		  Page<DabianmingdanView> page =new Query<DabianmingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DabianmingdanVO> selectListVO(Wrapper<DabianmingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DabianmingdanVO selectVO(Wrapper<DabianmingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DabianmingdanView> selectListView(Wrapper<DabianmingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DabianmingdanView selectView(Wrapper<DabianmingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
