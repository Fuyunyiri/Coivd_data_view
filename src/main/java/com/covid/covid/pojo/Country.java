package com.covid.covid.pojo;

import java.util.Date;

/**
 * @author 李珈鋆
 * @version 1.0
 */
public class Country {
    public String name;
    public int value;

    public Country(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
