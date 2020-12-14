package com.cmsr.sicp.custom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author gongzunhao
 * @version 1.0
 * @date 2020/12/7 12:10
 */
@RestController
@RequestMapping("/moduleadmin/t-content")
public class Test {



    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        System.out.println("健康敬爱的尽快哈嘎都是几号回家大盛魁建行卡vjkvhdaJHKVAVHJKS");
        return "hello world!!!";
    }
}
