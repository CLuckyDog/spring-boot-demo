package com.rh.entity;

/**
 * Created by Administrator on 2019/8/11.
 */
public class GlobalEntity {
    private GlobalEntity() {}

    private static GlobalEntity instance;
    public static synchronized GlobalEntity getInstance() {
        if (instance == null) {
            instance = new GlobalEntity();
        }
        return instance;
    }

    public int number=0;


}
