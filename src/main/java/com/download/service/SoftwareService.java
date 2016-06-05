package com.download.service;

import com.download.bean.Software;
import com.download.dao.SoftwareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Laily on 16/6/2.
 */
@Service
public class SoftwareService {
    @Autowired
    @Qualifier("softwareDaoImpl")
    SoftwareDao softwareDao;

    /**
     * 通过软件ident获取软件对象
     * @param ident
     * @return
     */
    public Software getByIdent(String ident){
        return softwareDao.getByIdent(ident);
    }
}
