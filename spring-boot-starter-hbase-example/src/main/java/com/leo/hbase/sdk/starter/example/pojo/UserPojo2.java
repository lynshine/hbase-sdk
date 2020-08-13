package com.leo.hbase.sdk.starter.example.pojo;


import com.leo.hbase.sdk.core.annotation.HBaseRowKey;
import com.leo.hbase.sdk.core.annotation.HBaseTable;

/**
 * <p>User2 Pojo</p>
 *
 * @author leo.jie (leojie1314@gmail.com)
 * @version 1.0
 * @organization bigdata
 * @website https://www.jielongping.com
 * @date 2020/6/23 11:53 上午
 * @since 1.0
 */
@HBaseTable(name = "user2", uniqueFamily = "info")
public class UserPojo2 {
    @HBaseRowKey
    private String rowKey;
    private boolean isVip;
    //private String address;

    public String getRowKey() {
        return rowKey;
    }

    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

 /*   public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/
}