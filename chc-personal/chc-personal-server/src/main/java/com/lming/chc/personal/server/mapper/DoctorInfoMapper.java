package com.lming.chc.personal.server.mapper;

import com.lming.chc.personal.server.entity.DoctorInfo;
import com.lming.chc.personal.server.entity.DoctorInfoExample;
import com.lming.chc.personal.server.entity.DoctorInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorInfoMapper {
    long countByExample(DoctorInfoExample example);

    int deleteByExample(DoctorInfoExample example);

    int deleteByPrimaryKey(DoctorInfoKey key);

    int insert(DoctorInfo record);

    int insertSelective(DoctorInfo record);

    List<DoctorInfo> selectByExample(DoctorInfoExample example);

    DoctorInfo selectByPrimaryKey(DoctorInfoKey key);

    int updateByExampleSelective(@Param("record") DoctorInfo record, @Param("example") DoctorInfoExample example);

    int updateByExample(@Param("record") DoctorInfo record, @Param("example") DoctorInfoExample example);

    int updateByPrimaryKeySelective(DoctorInfo record);

    int updateByPrimaryKey(DoctorInfo record);
}