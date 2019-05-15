package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springcloud2
 * @Date: 2019/5/13 19:55
 * @Author: 任豪杰
 * @Description:
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toAddGoods")
    public String toAddGoods() {
        return "addGood";
    }

    @RequestMapping("togoodPage")
    public String togoodPage(){
        return "goodPage";
    }
}
