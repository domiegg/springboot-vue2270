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


import com.dao.DaoshiketixuanzeDao;
import com.entity.DaoshiketixuanzeEntity;
import com.service.DaoshiketixuanzeService;
import com.entity.vo.DaoshiketixuanzeVO;
import com.entity.view.DaoshiketixuanzeView;

@Service("daoshiketixuanzeService")
public class DaoshiketixuanzeServiceImpl extends ServiceImpl<DaoshiketixuanzeDao, DaoshiketixuanzeEntity> implements DaoshiketixuanzeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaoshiketixuanzeEntity> page = this.selectPage(
                new Query<DaoshiketixuanzeEntity>(params).getPage(),
                new EntityWrapper<DaoshiketixuanzeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaoshiketixuanzeEntity> wrapper) {
		  Page<DaoshiketixuanzeView> page =new Query<DaoshiketixuanzeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaoshiketixuanzeVO> selectListVO(Wrapper<DaoshiketixuanzeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaoshiketixuanzeVO selectVO(Wrapper<DaoshiketixuanzeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaoshiketixuanzeView> selectListView(Wrapper<DaoshiketixuanzeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaoshiketixuanzeView selectView(Wrapper<DaoshiketixuanzeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
