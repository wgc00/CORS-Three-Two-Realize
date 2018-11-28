package com.wgc.jsonp.filter;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.annotation.WebFilter;
import java.util.Arrays;
import java.util.Collections;
//  视为一个过滤器配置可以在web.xml配置，也可以直接使用注解
@WebFilter("/*")
public class MyCorsFilter extends CorsFilter {
    public MyCorsFilter() {
        super(configurationSource());
    }

    private static UrlBasedCorsConfigurationSource configurationSource() {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration = new CorsConfiguration();
//        设置允许访问的网络
        configuration.setAllowedOrigins(Collections.singletonList("http://192.168.1.133:8081"));
//        设置允许访问的方法
        configuration.setAllowedMethods(Arrays.asList(new String[]{"GET", "POST"}));
//        设置头部信息Access-Control-Allow-Origin是必须写的
        configuration.setAllowedHeaders(Collections.singletonList("Access-Control-Allow-Origin"));
//        设置是否从服务器获取cookie
        configuration.setAllowCredentials(true);
//        设置准备响应前缓存持续的最大时间
        configuration.setMaxAge(Long.valueOf(3600));
//        注册configuration是那个方法或类上访问的
        source.registerCorsConfiguration("/mvc", configuration);
//        可以创建多个Configuration
        return source;
    }

}
