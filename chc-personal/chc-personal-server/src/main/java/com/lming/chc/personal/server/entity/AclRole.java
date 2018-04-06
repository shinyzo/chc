package com.lming.chc.personal.server.entity;

import java.io.Serializable;

/**
 * acl_role
 * @author 
 */
public class AclRole implements Serializable {
    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 可否修改1，不可修改，0：可以修改
     */
    private String ifmodify;

    /**
     * 可否删除 1，不可删除，0：可以删除
     */
    private String ifdelete;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIfmodify() {
        return ifmodify;
    }

    public void setIfmodify(String ifmodify) {
        this.ifmodify = ifmodify;
    }

    public String getIfdelete() {
        return ifdelete;
    }

    public void setIfdelete(String ifdelete) {
        this.ifdelete = ifdelete;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AclRole other = (AclRole) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getIfmodify() == null ? other.getIfmodify() == null : this.getIfmodify().equals(other.getIfmodify()))
            && (this.getIfdelete() == null ? other.getIfdelete() == null : this.getIfdelete().equals(other.getIfdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getIfmodify() == null) ? 0 : getIfmodify().hashCode());
        result = prime * result + ((getIfdelete() == null) ? 0 : getIfdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", ifmodify=").append(ifmodify);
        sb.append(", ifdelete=").append(ifdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}