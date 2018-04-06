package com.lming.chc.personal.server.mapper;

import com.lming.chc.personal.server.entity.AclRole;
import com.lming.chc.personal.server.entity.AclRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AclRoleMapper {
    long countByExample(AclRoleExample example);

    int deleteByExample(AclRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(AclRole record);

    int insertSelective(AclRole record);

    List<AclRole> selectByExample(AclRoleExample example);

    AclRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") AclRole record, @Param("example") AclRoleExample example);

    int updateByExample(@Param("record") AclRole record, @Param("example") AclRoleExample example);

    int updateByPrimaryKeySelective(AclRole record);

    int updateByPrimaryKey(AclRole record);
}