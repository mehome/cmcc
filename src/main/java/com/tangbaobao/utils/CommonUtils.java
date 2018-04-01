package com.tangbaobao.utils;

import java.util.UUID;

/**
 * 公共工具类
 *
 * @author 唐学俊
 * @create 2018/01/31
 **/

public class CommonUtils {
    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        return s;
    }
}
