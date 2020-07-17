package com.example.demo.service.impl;

import com.example.demo.service.IUserCredential;


/**
 * Copyright (C), 2018-2019, copyright info. DAMU., Ltd.
 * FileName: com.imooc.impl UserCredentialImpl
 * <p>TODO</p>
 *
 * @version 1.00
 */
public class UserCredentialImpl implements IUserCredential {
    @Override
    public String verifyUser(String username) {
        if ("admin".equals(username)) {
            return "系统管理员";
        } else if("manager".equals(username)) {
            return "用户管理员";
        }
        return "普通会员";
    }
}
