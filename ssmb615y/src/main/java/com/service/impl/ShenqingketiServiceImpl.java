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


import com.dao.ShenqingketiDao;
import com.entity.ShenqingketiEntity;
import com.service.ShenqingketiService;
import com.entity.vo.ShenqingketiVO;
import com.entity.view.ShenqingketiView;

@Service("shenqingketiService")
public class ShenqingketiServiceImpl extends ServiceImpl<ShenqingketiDao, ShenqingketiEntity> implements ShenqingketiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingketiEntity> page = this.selectPage(
                new Query<ShenqingketiEntity>(params).getPage(),
                new EntityWrapper<ShenqingketiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingketiEntity> wrapper) {
		  Page<ShenqingketiView> page =new Query<ShenqingketiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingketiVO> selectListVO(Wrapper<ShenqingketiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingketiVO selectVO(Wrapper<ShenqingketiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingketiView> selectListView(Wrapper<ShenqingketiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingketiView selectView(Wrapper<ShenqingketiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
