package com.xiaoer.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import com.xiaoer.manage.entity.Goods;

@Mapper
public interface GoodsMapper {
	
	@Results(id="Goods",value= {
		@Result(column="goods_id",property="iGoodsId",jdbcType=JdbcType.INTEGER,id=true),
		@Result(column="goods_name",property="sGoodsName",jdbcType=JdbcType.VARCHAR),
		@Result(column="price",property="fPrice",jdbcType=JdbcType.VARCHAR),
		@Result(column="status",property="iState",jdbcType=JdbcType.INTEGER),
		@Result(column="goods_introduction",property="sGoodsIntroduction",jdbcType=JdbcType.VARCHAR),
		@Result(column="pic_address",property="sPicAddress",jdbcType=JdbcType.VARCHAR),
	})
	@Select("select * from goods")
	List<Goods> getGoods();
	
	@Select("select * from goods where goods_id=#{GoodsId)")
	@ResultMap(value ="Goods")
	Goods findGoods(int id);
	
	@Insert("insert into goods values(goods_id,goods_name,price,status,goods_introduction,pic_address)values(#{iGoodSId},#{sGoodsName},#{fPrice},#{iState},#{sGoodsIntroduction},#{sPicAddress})")
	Boolean addGoods(Goods goods);
	
	@Update("update goods set goods_name=#{iGoodsname},price=#{fPrice},status={#iState},goods_introduction={#sGoodsIntroduction},pic_address={#sPicAddress} where goods_id={#iGoodsId}")
	Boolean updateGoods(Goods goods);
	
	@Delete("delete from goods where goods_id={#iGoodsId}")
	Boolean delGoods(int iGoodsId);
}
