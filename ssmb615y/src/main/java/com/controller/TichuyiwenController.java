package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TichuyiwenEntity;
import com.entity.view.TichuyiwenView;

import com.service.TichuyiwenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 提出疑问
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
@RestController
@RequestMapping("/tichuyiwen")
public class TichuyiwenController {
    @Autowired
    private TichuyiwenService tichuyiwenService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TichuyiwenEntity tichuyiwen, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("daoshi")) {
			tichuyiwen.setDaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			tichuyiwen.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TichuyiwenEntity> ew = new EntityWrapper<TichuyiwenEntity>();
		PageUtils page = tichuyiwenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tichuyiwen), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TichuyiwenEntity tichuyiwen, HttpServletRequest request){
        EntityWrapper<TichuyiwenEntity> ew = new EntityWrapper<TichuyiwenEntity>();
		PageUtils page = tichuyiwenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tichuyiwen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TichuyiwenEntity tichuyiwen){
       	EntityWrapper<TichuyiwenEntity> ew = new EntityWrapper<TichuyiwenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tichuyiwen, "tichuyiwen")); 
        return R.ok().put("data", tichuyiwenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TichuyiwenEntity tichuyiwen){
        EntityWrapper< TichuyiwenEntity> ew = new EntityWrapper< TichuyiwenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tichuyiwen, "tichuyiwen")); 
		TichuyiwenView tichuyiwenView =  tichuyiwenService.selectView(ew);
		return R.ok("查询提出疑问成功").put("data", tichuyiwenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TichuyiwenEntity tichuyiwen = tichuyiwenService.selectById(id);
        return R.ok().put("data", tichuyiwen);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TichuyiwenEntity tichuyiwen = tichuyiwenService.selectById(id);
        return R.ok().put("data", tichuyiwen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TichuyiwenEntity tichuyiwen, HttpServletRequest request){
    	tichuyiwen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tichuyiwen);

        tichuyiwenService.insert(tichuyiwen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TichuyiwenEntity tichuyiwen, HttpServletRequest request){
    	tichuyiwen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tichuyiwen);

        tichuyiwenService.insert(tichuyiwen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TichuyiwenEntity tichuyiwen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tichuyiwen);
        tichuyiwenService.updateById(tichuyiwen);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tichuyiwenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TichuyiwenEntity> wrapper = new EntityWrapper<TichuyiwenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("daoshi")) {
			wrapper.eq("daoshizhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = tichuyiwenService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
