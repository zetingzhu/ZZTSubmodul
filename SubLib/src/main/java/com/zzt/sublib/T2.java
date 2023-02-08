package com.zzt.sublib;

/**
 * @author: zeting
 * @date: 2023/2/8
 */
public class T2 {
    private static volatile T2 instance;

    public T2() {
    }

    public static T2 getInstance() {
        if (instance == null) {
            synchronized (T2.class) {
                if (instance == null) {
                    instance = new T2();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return "这是第二次提交";
    }
}
