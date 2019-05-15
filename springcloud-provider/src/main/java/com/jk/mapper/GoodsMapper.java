package com.jk.mapper;

import com.jk.model.GoodsBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @program: springcloud2
 * @Date: 2019/5/13 19:23
 * @Author: 任豪杰
 * @Description:
 */
public interface GoodsMapper {
    @Select("select * from t_goods")
    List<GoodsBean> queryGoodsList();

    @Delete("delete from t_goods where id=#{value}")
    void deleteGood(Integer id);

    @Insert("insert into t_goods(name,price,stock,createtime) values(#{name},#{price},#{stock},#{createtime}) " )
    void insGoodsList(GoodsBean goodsBean);

    @Select(" select * from t_goods where id=#{id} ")
    GoodsBean queryGoodById(Integer id);

    @Update("update t_goods set name=#{name},price=#{price},stock=#{stock},createtime=#{createtime} where id=#{id}")
    void updGoodsList(GoodsBean goodsBean);
}
