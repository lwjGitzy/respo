package com.jk.controller;

import com.jk.model.GoodsBean;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springcloud2
 * @Date: 2019/5/13 17:51
 * @Author: 任豪杰
 * @Description:
 */
@Controller
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    //回显
    @GetMapping("queryGoodById")
    @ResponseBody
    public GoodsBean queryGoodById(Integer id) {
        return goodsService.queryGoodById(id);
    }

    //新增
    @PostMapping("insGoodsList")
    @ResponseBody
    public void insGoodsList(GoodsBean goodsBean) {
        goodsService.insGoodsList(goodsBean);
    }

    //删除
    @DeleteMapping("deleteGood")
    @ResponseBody
    public void deleteGood(Integer id){
        goodsService.deleteGood(id);
    }

    @GetMapping("queryGoodsList")
    @ResponseBody
    public List<GoodsBean> queryGoodsList(){
        return goodsService.queryGoodsList();
    }
}
