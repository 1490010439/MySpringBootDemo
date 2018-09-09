package com.tz.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.tz.springbootdemo.po.Rizhi;
import com.tz.springbootdemo.service.RizhiService;
import com.tz.springbootdemo.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RizhiController {

    @Autowired
    public RizhiService rizhiService;

    //返回日志列表
    //http://localhost:8080/selectRizhiList
    @RequestMapping("/selectRizhiList")

    public String selectRizhiList()throws Exception {
        List<Rizhi> myList =rizhiService.selectRizhiList();

           // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
           //return myList;
           //return JSON.toJSONString(myList);
         return new AjaxResult("rizhilist", JSON.toJSONString(myList)).toString();

    }


}
