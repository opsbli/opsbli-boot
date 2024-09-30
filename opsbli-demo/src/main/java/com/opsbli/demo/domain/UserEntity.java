package com.opsbli.demo.domain;

import com.easy.query.core.annotation.*;
import com.easy.query.core.basic.extension.logicdel.LogicDeleteStrategyEnum;
import com.easy.query.core.proxy.ProxyEntityAvailable;
import com.opsbli.demo.domain.proxy.UserEntityProxy;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 实体类。
 *
 * @author easy-query-plugin automatic generation
 * @since 1.0
 */
@Data
@Table(value = "user")
@EntityFileProxy
public class UserEntity implements ProxyEntityAvailable<UserEntity , UserEntityProxy> {

    @Column(primaryKey = true, value = "id")
    private Integer id;

    private String name;

    private Integer balance;

    private Integer version;
    
    @UpdateIgnore
    private LocalDateTime createTime;
    
    private LocalDateTime updateTime;

    private Boolean enabled;

    @LogicDelete(strategy = LogicDeleteStrategyEnum.BOOLEAN)
    @UpdateIgnore
    private Boolean deleted;

    private Integer companyId;


}
