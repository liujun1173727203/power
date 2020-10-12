package com.xiaoer.manage.serverImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaoer.manage.dao.GoodsMapper;
import com.xiaoer.manage.entity.Goods;
import com.xiaoer.manage.server.GoodsServer;

public class GoodsServerlmpl implements GoodsServer{

	@Autowired
	private GoodsMapper goodsMapper;
	@Override
	public List<Goods> getGoods() {
		// TODO Auto-generated method stub
		return goodsMapper.getGoods();
	}
 
	@Override
	public Goods findGoods(int id) {
		// TODO Auto-generated method stub
		return goodsMapper.findGoods(id);
	}

	@Override
	public Boolean addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.addGoods(goods);
	}

	@Override
	public Boolean updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.updateGoods(goods);
	}

	@Override
	public Boolean delGoods(int iGoodsId) {
		// TODO Auto-generated method stub
		return goodsMapper.delGoods(iGoodsId);
	}

}
