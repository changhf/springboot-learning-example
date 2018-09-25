package org.spring.springboot.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadDataDemo {

    @RequestMapping(value = "/monitor/uploadData", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String uploadOriginData(@RequestBody JSONObject data) {
        // 直接将json信息打印出来
        System.out.println(data.toJSONString());

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "json");
        result.put("data", data);

        return result.toJSONString();
    }
}