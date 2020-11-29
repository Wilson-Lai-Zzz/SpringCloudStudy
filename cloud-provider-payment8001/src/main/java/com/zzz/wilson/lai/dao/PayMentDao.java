package com.zzz.wilson.lai.dao;

import com.zzz.wilson.lai.entities.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayMentDao {
    /**
     * 插入
     * */
    public int create(PayMent payMent);
    /**
     * 根据Id查询
     * */
    public PayMent getPayMentById(@Param("id") Long id);
}
