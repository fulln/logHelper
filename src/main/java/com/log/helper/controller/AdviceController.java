package com.log.helper.controller;

import com.alibaba.fastjson.JSON;
import com.log.helper.pojo.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@RestController
@RequestMapping("/log")
public class AdviceController {

    @RequestMapping("/advice/1")
    public String advice(@RequestParam String code) {
        return code;
    }

    @RequestMapping("/advice/2")
    public String adviceMutParams(@RequestParam String code, @RequestParam String params) {
        return code + params;
    }

    @RequestMapping("/advice/3")
    public String adviceJSON(@RequestBody Car code) {
        return JSON.toJSONString(code);
    }

    @RequestMapping("/advice/4")
    public String adviceJSONAndParams(@RequestBody Car code, @RequestParam String params) {
        return JSON.toJSONString(code) + params;
    }

    @RequestMapping("/advice/5")
    public String adviceFile(@RequestParam String code,@RequestParam CommonsMultipartFile file) {
        return code;
    }

}
