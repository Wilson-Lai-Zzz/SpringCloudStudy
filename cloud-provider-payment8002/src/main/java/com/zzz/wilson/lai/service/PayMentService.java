package com.zzz.wilson.lai.service;

import com.zzz.wilson.lai.entities.PayMent;
import org.apache.ibatis.annotations.Param;

public interface PayMentService {
    /**
     * 插入
     * */
    public int create(PayMent payMent);
    /**
     * 根据Id查询
     * */
    public PayMent getPayMentById(@Param("id") Long id);
}
