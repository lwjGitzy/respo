package com.jk.service;

import com.jk.model.GoodsBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springcloud2
 * @Date: 2019/5/13 19:30
 * @Author: 任豪杰
 * @Description:
 */
@FeignClient("springcloud-server")
public interface GoodsService {

    @GetMapping("queryGoodsList")
    List<GoodsBean> queryGoodsList();

    @DeleteMapping("deleteGood/{id}")
    void deleteGood(@PathVariable("id") Integer id);

    @PostMapping("insGoodsList")
    void insGoodsList(@RequestBody GoodsBean goodsBean);

    @GetMapping("queryGoodById/{id}")
    GoodsBean queryGoodById(@PathVariable("id") Integer id);
}
