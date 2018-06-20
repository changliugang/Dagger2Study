package com.study.chang.dagger2study.main;

/**
 * @author 2018/6/20 11:59 / changliugang
 */
public class MainBean {

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "MainBean{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
