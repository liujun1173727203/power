package com.xiaoer.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoer.manage.entity.Goods;
import com.xiaoer.manage.server.GoodsServer;

@RestController
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private GoodsServer goodsServer;
	
	@RequestMapping(value="/getgoods",method=RequestMethod.GET)
	public List<Goods> getGoods(){
		return goodsServer.getGoods();
	}
	
	@RequestMapping(value="/findgood/{id}",method=RequestMethod.GET)
	public Goods findGood(@PathVariable("id")String id){
		return goodsServer.findGoods(Integer.valueOf(id));
	}
	
	@RequestMapping(value="/addgoods",method=RequestMethod.POST)
	public Boolean addGoods(Goods goods){
		return goodsServer.addGoods(goods);
	}
	
	@RequestMapping(value="/upgoods",method=RequestMethod.PUT)
	public Boolean upGoods(Goods goods){
		return goodsServer.updateGoods(goods);
	}
	@RequestMapping(value="/upgoods/{id}",method=RequestMethod.DELETE)
	public Boolean delGoods(@PathVariable("id")String id){
		return goodsServer.delGoods(Integer.valueOf(id));
	}
	
}
