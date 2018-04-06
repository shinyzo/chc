package com.lming.chc.personal.server.mapper;

import com.lming.chc.personal.server.entity.AclMobileRights;
import com.lming.chc.personal.server.entity.AclMobileRightsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AclMobileRightsMapper {
    long countByExample(AclMobileRightsExample example);

    int deleteByExample(AclMobileRightsExample example);

    int deleteByPrimaryKey(String navId);

    int insert(AclMobileRights record);

    int insertSelective(AclMobileRights record);

    List<AclMobileRights> selectByExample(AclMobileRightsExample example);

    AclMobileRights selectByPrimaryKey(String navId);

    int updateByExampleSelective(@Param("record") AclMobileRights record, @Param("example") AclMobileRightsExample example);

    int updateByExample(@Param("record") AclMobileRights record, @Param("example") AclMobileRightsExample example);

    int updateByPrimaryKeySelective(AclMobileRights record);

    int updateByPrimaryKey(AclMobileRights record);
}