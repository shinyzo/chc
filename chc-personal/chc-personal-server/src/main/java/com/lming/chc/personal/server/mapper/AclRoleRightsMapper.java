package com.lming.chc.personal.server.mapper;

import com.lming.chc.personal.server.entity.AclRoleRights;
import com.lming.chc.personal.server.entity.AclRoleRightsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AclRoleRightsMapper {
    long countByExample(AclRoleRightsExample example);

    int deleteByExample(AclRoleRightsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AclRoleRights record);

    int insertSelective(AclRoleRights record);

    List<AclRoleRights> selectByExample(AclRoleRightsExample example);

    AclRoleRights selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AclRoleRights record, @Param("example") AclRoleRightsExample example);

    int updateByExample(@Param("record") AclRoleRights record, @Param("example") AclRoleRightsExample example);

    int updateByPrimaryKeySelective(AclRoleRights record);

    int updateByPrimaryKey(AclRoleRights record);
}