package com.lming.chc.personal.server.mapper;

import com.lming.chc.personal.server.entity.AclRights;
import com.lming.chc.personal.server.entity.AclRightsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AclRightsMapper {
    long countByExample(AclRightsExample example);

    int deleteByExample(AclRightsExample example);

    int deleteByPrimaryKey(String rightId);

    int insert(AclRights record);

    int insertSelective(AclRights record);

    List<AclRights> selectByExample(AclRightsExample example);

    AclRights selectByPrimaryKey(String rightId);

    int updateByExampleSelective(@Param("record") AclRights record, @Param("example") AclRightsExample example);

    int updateByExample(@Param("record") AclRights record, @Param("example") AclRightsExample example);

    int updateByPrimaryKeySelective(AclRights record);

    int updateByPrimaryKey(AclRights record);
}