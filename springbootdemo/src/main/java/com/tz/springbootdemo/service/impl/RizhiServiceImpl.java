package com.tz.springbootdemo.service.impl;
import com.tz.springbootdemo.mapper.RizhiMapper;
import com.tz.springbootdemo.po.Rizhi;
import com.tz.springbootdemo.po.RizhiExample;
import com.tz.springbootdemo.service.RizhiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**

* @Description:    日志服务的实现类

* @Author:         钟盛勤

* @CreateDate:     2018/9/9 10:29

* @UpdateUser:     钟盛勤

* @UpdateDate:     2018/9/9 10:29

* @UpdateRemark:   修改内容

* @Version:        1.0

*/

@Service
public class RizhiServiceImpl implements RizhiService{


    @Autowired
    private RizhiMapper rizhiMapper;

    @Override
    public List<Rizhi> selectRizhiList()
    {
        List<Rizhi> list=new ArrayList<Rizhi>();

        RizhiExample rizhiExample=new RizhiExample();

        list=rizhiMapper.selectByExampleWithBLOBs(rizhiExample);

        return list;
    }

}
