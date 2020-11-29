package com.zzz.wilson.lai.service.impl;

import com.zzz.wilson.lai.dao.PayMentDao;
import com.zzz.wilson.lai.entities.PayMent;
import com.zzz.wilson.lai.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayMentServiceImpl implements PayMentService {
    @Autowired
    private PayMentDao payMentDao;
    @Override
    public int create(PayMent payMent) {
        return payMentDao.create(payMent);
    }

    @Override
    public PayMent getPayMentById(Long id) {
        return payMentDao.getPayMentById(id);
    }
}
