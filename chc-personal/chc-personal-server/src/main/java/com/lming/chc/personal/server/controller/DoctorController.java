package com.lming.chc.personal.server.controller;

import com.github.pagehelper.PageInfo;
import com.lming.chc.personal.server.entity.DoctorInfo;
import com.lming.chc.personal.server.entity.DoctorInfoExample;
import com.lming.chc.personal.server.entity.DoctorInfoKey;
import com.lming.chc.personal.server.frontform.DoctorQueryForm;
import com.lming.chc.personal.server.frontform.ResultVO;
import com.lming.chc.personal.server.frontform.ResultVOUtil;
import com.lming.chc.personal.server.mapper.DoctorInfoMapper;
import com.lming.chc.personal.server.mapper.DoctorMapper;
import com.lming.chc.personal.server.repository.DoctorRepository;
import com.lming.chc.personal.server.service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/doctor")
@Slf4j
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @GetMapping("/list")
    public ResultVO list(DoctorQueryForm doctorQueryForm){

        doctorQueryForm.setPageNum(0);
        doctorQueryForm.setPageSize(2);

        List<DoctorInfo> doctorInfoList = doctorService.findByPage(doctorQueryForm).getList();
        log.info("mapper :{}",doctorInfoList);
        return ResultVOUtil.success(doctorInfoList);

    }


}
