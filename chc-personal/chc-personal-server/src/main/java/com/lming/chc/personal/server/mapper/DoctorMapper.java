package com.lming.chc.personal.server.mapper;

import com.lming.chc.personal.server.entity.DoctorInfo;

import java.util.List;
import java.util.Map;

public interface DoctorMapper {

    List<DoctorInfo> findAll(Map<String, Object> map);

}
