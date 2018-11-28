package com.wgc.jsonp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
/*
*   将跨域设置在类上，那么所有的 mapping 都会使用这个策略
*   如果不加参数，那么将会使用配置中的默认参数
* */
/* @CrossOrigin */
public class JSONPController {
    @RequestMapping("/cors")
    public String demo(HttpServletResponse response, String callback) {
        return callback + "('sdfdsf')";
    }

    @RequestMapping("/jsonpdata")
    public String demo1(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://192.168.1.178:8081");
        return "susses";
    }

    @RequestMapping("/mvc")
    /*
    * origins：能访问的网络ip
    * methods：允许什么方法可以访问
    * allowedHeaders：头部信息，这里一定要写上Access-Control-Allow-Origin
    * 如果还有其他头部信息可以使用逗号隔开； 如： {"Content-Type", "Access-Control-Allow-Origin"}
    * allowCredentials：cookie是否返回到服务器,true是返回
    *maxAge：准备响应前缓存持续的最大时间
    * */
 /*   @CrossOrigin(origins = {"http://192.168.1.133:8081", "http://domain2.com"},
                methods = {RequestMethod.GET, RequestMethod.POST},
                allowedHeaders = {"Access-Control-Allow-Origin"},
                allowCredentials = "true",
                maxAge = 123445)*/
    public String demo2() {
        return  "hello, word";
    }

}
