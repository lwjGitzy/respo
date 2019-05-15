package com.jk.service;

import com.jk.mapper.GoodsMapper;
import com.jk.model.GoodsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springcloud2
 * @Date: 2019/5/13 19:24
 * @Author: 任豪杰
 * @Description:
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsBean> queryGoodsList() {
        return goodsMapper.queryGoodsList();
    }

    @Override
    public void deleteGood(Integer id) {
        goodsMapper.deleteGood(id);
    }

    @Override
    public void insGoodsList(GoodsBean goodsBean) {
        if (goodsBean.getId() == null){
            goodsMapper.insGoodsList(goodsBean);
        }else {
            goodsMapper.updGoodsList(goodsBean);
        }

    }

    @Override
    public GoodsBean queryGoodById(Integer id) {
        return goodsMapper.queryGoodById(id);
    }
}
