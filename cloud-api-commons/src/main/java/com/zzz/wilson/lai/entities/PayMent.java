package com.zzz.wilson.lai.entities;

import java.io.Serializable;

public class PayMent implements Serializable {
    /**
     * 主键
     * */
    private Long id;
    /**
     * 流水号
     * */
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
