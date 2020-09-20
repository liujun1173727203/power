package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.xiaoer.manage.entity.Order;

@Mapper
public interface OrderMapper {
	@Results(id="orders",value= {
			@Result(column="order_id",property="iOrderId",jdbcType=JdbcType.INTEGER),
			@Result(column="order_uid",property="iOderuId",jdbcType=JdbcType.INTEGER),
			@Result(column="order_price",property="fOrderPrice",jdbcType=JdbcType.FLOAT),
			@Result(column="order_status",property="iOrderStatus",jdbcType=JdbcType.INTEGER),
			@Result(column="order_goodsid",property="iOrderGoodsId",jdbcType=JdbcType.INTEGER),
	})
	@Select("select * from `order`")
	List<Order> getOders();
	
	@Select("select * from `order` as a,Goods as b where a.order_uid={#iOrderuId} and b.goods_id={#iOrderGoodsId}")
	Order getOrder();	
}
