package com.rh.web;

import com.rh.entity.GlobalEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/28.
 */
@RestController
public class HelloController {

    @RequestMapping("/say")
    public Object hello(){
        GlobalEntity entity=GlobalEntity.getInstance();
        entity.number++;
        return entity.number;
    }

    @RequestMapping("/talk")
    public Object talk(){
        GlobalEntity entity=GlobalEntity.getInstance();
        entity.number++;
        return entity.number;
    }
}
