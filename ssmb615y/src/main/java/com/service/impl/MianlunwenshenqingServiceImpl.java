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


import com.dao.MianlunwenshenqingDao;
import com.entity.MianlunwenshenqingEntity;
import com.service.MianlunwenshenqingService;
import com.entity.vo.MianlunwenshenqingVO;
import com.entity.view.MianlunwenshenqingView;

@Service("mianlunwenshenqingService")
public class MianlunwenshenqingServiceImpl extends ServiceImpl<MianlunwenshenqingDao, MianlunwenshenqingEntity> implements MianlunwenshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianlunwenshenqingEntity> page = this.selectPage(
                new Query<MianlunwenshenqingEntity>(params).getPage(),
                new EntityWrapper<MianlunwenshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianlunwenshenqingEntity> wrapper) {
		  Page<MianlunwenshenqingView> page =new Query<MianlunwenshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianlunwenshenqingVO> selectListVO(Wrapper<MianlunwenshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianlunwenshenqingVO selectVO(Wrapper<MianlunwenshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianlunwenshenqingView> selectListView(Wrapper<MianlunwenshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianlunwenshenqingView selectView(Wrapper<MianlunwenshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
