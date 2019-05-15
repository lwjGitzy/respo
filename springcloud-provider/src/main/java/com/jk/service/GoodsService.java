package com.jk.service;

import com.jk.model.GoodsBean;

import java.util.List;

/**
 * @program: springcloud2
 * @Date: 2019/5/13 19:23
 * @Author: 任豪杰
 * @Description:
 */
public interface GoodsService {

    List<GoodsBean> queryGoodsList();

    void deleteGood(Integer id);

    void insGoodsList(GoodsBean goodsBean);

    GoodsBean queryGoodById(Integer id);
}
