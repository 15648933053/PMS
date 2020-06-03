package com.starcpdk.service.impl;

import com.starcpdk.dao.PMSDao;
import com.starcpdk.dao.impl.PMSDaoImpl;
import com.starcpdk.entity.PMS;
import com.starcpdk.service.PMSService;

public class PMSServiceImpl implements PMSService {

    PMSDao pmsDao = new PMSDaoImpl();

    @Override
    public boolean updpms(PMS pms){
        boolean updpms = pmsDao.updpms(pms);
        return updpms;
    }

    @Override
    public PMS selPms() {
        PMS pms = pmsDao.selPms();
        return pms;
    }
}
