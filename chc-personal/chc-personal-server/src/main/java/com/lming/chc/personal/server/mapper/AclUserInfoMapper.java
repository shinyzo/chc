package com.lming.chc.personal.server.mapper;

import com.lming.chc.personal.server.entity.AclUserInfo;
import com.lming.chc.personal.server.entity.AclUserInfoExample;
import com.lming.chc.personal.server.entity.AclUserInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AclUserInfoMapper {
    long countByExample(AclUserInfoExample example);

    int deleteByExample(AclUserInfoExample example);

    int deleteByPrimaryKey(AclUserInfoKey key);

    int insert(AclUserInfo record);

    int insertSelective(AclUserInfo record);

    List<AclUserInfo> selectByExample(AclUserInfoExample example);

    AclUserInfo selectByPrimaryKey(AclUserInfoKey key);

    int updateByExampleSelective(@Param("record") AclUserInfo record, @Param("example") AclUserInfoExample example);

    int updateByExample(@Param("record") AclUserInfo record, @Param("example") AclUserInfoExample example);

    int updateByPrimaryKeySelective(AclUserInfo record);

    int updateByPrimaryKey(AclUserInfo record);
}