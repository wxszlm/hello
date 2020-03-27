package top.yxf.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wuxiangsheng
 * @description 测试虚拟机中的环境配置
 * @className HelloController
 * @date 2019/5/6 9:32
 **/
@RestController
public class HelloController {


    @RequestMapping("/")
    public String hello() {
        return "hello world jenkins";
    }

    public static void main(String[] args) {
        String str = "opt,max,tpo,hi,tpo,hide,ih,pot,max";
        // 转换成数组
        String[] arr = str.split(",");

        // 去重复
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println("去除重复后的list集合" + list);
        // 将集合中的字符进行重新排序，得到新的集合，新的集合和旧的集合角标相同
        List<String> list2 = new ArrayList<String>();
        for (String s : list) {
            // byte数组和String字符串相互转化排序
            byte[] arr1 = s.getBytes();
            Arrays.sort(arr1);
            list2.add(new String(arr1));
        }
        String s3 = "";
        for (int i = 0; i < list2.size(); i++) {

            s3 = list2.get(i);

            // 排除已经比较的元素
            if (s3.equals("--")) {
                continue;
            }
            // 输出结果
            String resStr = "";
            for (int j = 0; j < list2.size(); j++) {
                if (s3.equals(list2.get(j))) {

                    resStr += list.get(j) + ",";
                    list2.set(j, "--");
                }
            }
            // 去掉最后的逗号
            System.out.println(resStr.substring(0, resStr.length() - 1));
        }
    }

}
