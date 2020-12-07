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
        return "hello world!!!";
    }
}
