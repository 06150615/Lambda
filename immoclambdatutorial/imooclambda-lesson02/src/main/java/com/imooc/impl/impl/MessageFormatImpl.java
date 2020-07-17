package com.imooc.impl.impl;

import com.imooc.IMessageFormat;

/**
 * Copyright (C), 2018-2019, copyright info. DAMU., Ltd.
 * FileName: com.imooc.impl.impl MessageFormatImpl
 * <p>TODO</p>
 *
@author* @version 1.00
 */
public class MessageFormatImpl implements IMessageFormat {
    @Override
    public String format(String message, String format) {
        System.out.println("消息转换...");
        return  message;
    }
}
