package com.lming.chc.personal.server.service;

import com.github.pagehelper.PageInfo;
import com.lming.chc.personal.server.entity.DoctorInfo;
import com.lming.chc.personal.server.frontform.DoctorQueryForm;

public interface DoctorService {

    public PageInfo<DoctorInfo> findByPage(DoctorQueryForm doctorQueryForm);


}
