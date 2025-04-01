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


import com.dao.JiaoshiketixuanzeDao;
import com.entity.JiaoshiketixuanzeEntity;
import com.service.JiaoshiketixuanzeService;
import com.entity.vo.JiaoshiketixuanzeVO;
import com.entity.view.JiaoshiketixuanzeView;

@Service("jiaoshiketixuanzeService")
public class JiaoshiketixuanzeServiceImpl extends ServiceImpl<JiaoshiketixuanzeDao, JiaoshiketixuanzeEntity> implements JiaoshiketixuanzeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshiketixuanzeEntity> page = this.selectPage(
                new Query<JiaoshiketixuanzeEntity>(params).getPage(),
                new EntityWrapper<JiaoshiketixuanzeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshiketixuanzeEntity> wrapper) {
		  Page<JiaoshiketixuanzeView> page =new Query<JiaoshiketixuanzeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshiketixuanzeVO> selectListVO(Wrapper<JiaoshiketixuanzeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshiketixuanzeVO selectVO(Wrapper<JiaoshiketixuanzeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshiketixuanzeView> selectListView(Wrapper<JiaoshiketixuanzeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshiketixuanzeView selectView(Wrapper<JiaoshiketixuanzeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
