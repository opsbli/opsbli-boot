package com.opsbli.demo.controller;

import com.easy.query.api.proxy.client.EasyEntityQuery;
import com.opsbli.demo.domain.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * demo
 *
 * @author huangxinhui
 * @date 2024/9/30 17:08
 */
@RestController
@RequestMapping(value ="demo")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class DemoController {

    private final EasyEntityQuery easyEntityQuery;
    
    @GetMapping("/query")
    public Object query() {
        // List<UserEntity> list = easyEntityQuery.queryable(UserEntity.class)
        //         .where(t -> t.id().isNotNull())
        //         .toList();
        // return list;
        return easyEntityQuery.queryable(UserEntity.class)
                .where(u -> u.id().eq(1))
                .singleOrNull();
    }
    
}
