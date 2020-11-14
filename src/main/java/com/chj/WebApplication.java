package com.chj;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ：chj
 * @date ：Created in 2020/11/14 17:04
 * @params :  启动类
 */
@SpringBootApplication
@MapperScan("com.chj.Mapper.*")
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
