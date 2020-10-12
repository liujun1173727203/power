package com.xiaoer.manage.server;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xiaoer.manage.entity.Goods;

@Service
public interface GoodsServer {
	List<Goods> getGoods();
	Goods findGoods(int id);	
	Boolean addGoods(Goods goods);
	Boolean updateGoods(Goods goods);
	Boolean delGoods(int iGoodsId);
}
