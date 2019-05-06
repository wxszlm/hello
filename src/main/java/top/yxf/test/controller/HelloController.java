package top.yxf.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author wuxiangsheng
 *@description 测试虚拟机中的环境配置
 *@className HelloController
 *@date 2019/5/6 9:32
 *
 **/
@RestController
public class HelloController {


    @RequestMapping("/")
    public String hello(){
        return "hello world jenkins email";
    }

}
