package com.chen.transaction.demo1;

/**
 * Created by Chen on 2018/6/16.
 */
public class User {
    private String name;
    private String money;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
