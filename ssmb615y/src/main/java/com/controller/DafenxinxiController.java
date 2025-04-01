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

import com.entity.DafenxinxiEntity;
import com.entity.view.DafenxinxiView;

import com.service.DafenxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 打分信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-19 16:32:31
 */
@RestController
@RequestMapping("/dafenxinxi")
public class DafenxinxiController {
    @Autowired
    private DafenxinxiService dafenxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DafenxinxiEntity dafenxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			dafenxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			dafenxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DafenxinxiEntity> ew = new EntityWrapper<DafenxinxiEntity>();
		PageUtils page = dafenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dafenxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DafenxinxiEntity dafenxinxi, HttpServletRequest request){
        EntityWrapper<DafenxinxiEntity> ew = new EntityWrapper<DafenxinxiEntity>();
		PageUtils page = dafenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dafenxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DafenxinxiEntity dafenxinxi){
       	EntityWrapper<DafenxinxiEntity> ew = new EntityWrapper<DafenxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dafenxinxi, "dafenxinxi")); 
        return R.ok().put("data", dafenxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DafenxinxiEntity dafenxinxi){
        EntityWrapper< DafenxinxiEntity> ew = new EntityWrapper< DafenxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dafenxinxi, "dafenxinxi")); 
		DafenxinxiView dafenxinxiView =  dafenxinxiService.selectView(ew);
		return R.ok("查询打分信息成功").put("data", dafenxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DafenxinxiEntity dafenxinxi = dafenxinxiService.selectById(id);
        return R.ok().put("data", dafenxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DafenxinxiEntity dafenxinxi = dafenxinxiService.selectById(id);
        return R.ok().put("data", dafenxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DafenxinxiEntity dafenxinxi, HttpServletRequest request){
    	dafenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dafenxinxi);

        dafenxinxiService.insert(dafenxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DafenxinxiEntity dafenxinxi, HttpServletRequest request){
    	dafenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dafenxinxi);

        dafenxinxiService.insert(dafenxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DafenxinxiEntity dafenxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dafenxinxi);
        dafenxinxiService.updateById(dafenxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dafenxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DafenxinxiEntity> wrapper = new EntityWrapper<DafenxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = dafenxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
