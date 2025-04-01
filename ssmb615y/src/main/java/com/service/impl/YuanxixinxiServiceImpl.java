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


import com.dao.YuanxixinxiDao;
import com.entity.YuanxixinxiEntity;
import com.service.YuanxixinxiService;
import com.entity.vo.YuanxixinxiVO;
import com.entity.view.YuanxixinxiView;

@Service("yuanxixinxiService")
public class YuanxixinxiServiceImpl extends ServiceImpl<YuanxixinxiDao, YuanxixinxiEntity> implements YuanxixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxixinxiEntity> page = this.selectPage(
                new Query<YuanxixinxiEntity>(params).getPage(),
                new EntityWrapper<YuanxixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxixinxiEntity> wrapper) {
		  Page<YuanxixinxiView> page =new Query<YuanxixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxixinxiVO> selectListVO(Wrapper<YuanxixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxixinxiVO selectVO(Wrapper<YuanxixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxixinxiView> selectListView(Wrapper<YuanxixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxixinxiView selectView(Wrapper<YuanxixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
