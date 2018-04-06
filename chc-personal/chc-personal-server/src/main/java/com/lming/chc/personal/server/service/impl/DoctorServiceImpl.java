package com.lming.chc.personal.server.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lming.chc.personal.server.constants.PageConstant;
import com.lming.chc.personal.server.entity.DoctorInfo;
import com.lming.chc.personal.server.entity.DoctorInfoExample;
import com.lming.chc.personal.server.frontform.DoctorQueryForm;
import com.lming.chc.personal.server.mapper.DoctorInfoMapper;
import com.lming.chc.personal.server.service.DoctorService;
import com.lming.chc.personal.server.util.DefaultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorInfoMapper mapper;


    @Override
    public PageInfo<DoctorInfo> findByPage(DoctorQueryForm doctorQueryForm) {
        DoctorInfoExample example = new DoctorInfoExample();
//        PageHelper.startPage(
//                DefaultUtil.getVal(doctorQueryForm.getPageNum(), PageConstant.PAGE_NUM ),
//                DefaultUtil.getVal(doctorQueryForm.getPageSize(),PageConstant.PAGE_SIZE )
//        );

        example.setOffset(DefaultUtil.getVal(doctorQueryForm.getPageNum(), PageConstant.PAGE_NUM ));
        example.setLimit(DefaultUtil.getVal(doctorQueryForm.getPageSize(),PageConstant.PAGE_SIZE ));

        List<DoctorInfo> doctorInfoList = mapper.selectByExample(example);
        PageInfo<DoctorInfo> pageInfo = new PageInfo<>(doctorInfoList);
        return pageInfo;
    }
}
