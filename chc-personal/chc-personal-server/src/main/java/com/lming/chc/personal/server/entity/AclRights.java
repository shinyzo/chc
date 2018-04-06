package com.lming.chc.personal.server.entity;

import java.io.Serializable;

/**
 * acl_rights
 * @author 
 */
public class AclRights implements Serializable {
    /**
     * 菜单编号
     */
    private String rightId;

    /**
     * 菜单名称
     */
    private String rightName;

    /**
     * 菜单链接classname
     */
    private String rightIcon;

    /**
     * 菜单访问url，相当于actionname
     */
    private String linkUrl;

    /**
     * 0.根节点 1.菜单 2.按钮
     */
    private String menuType;

    private String operType;

    /**
     * 菜单父节点
     */
    private String parentId;

    /**
     * 对应的actionname
     */
    private String requestUrl;

    /**
     * 是否启用 0：启用，1：不启用
     */
    private String status;

    /**
     * 菜单排序，255排在最后，0最前
     */
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public String getRightId() {
        return rightId;
    }

    public void setRightId(String rightId) {
        this.rightId = rightId;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public String getRightIcon() {
        return rightIcon;
    }

    public void setRightIcon(String rightIcon) {
        this.rightIcon = rightIcon;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        AclRights other = (AclRights) that;
        return (this.getRightId() == null ? other.getRightId() == null : this.getRightId().equals(other.getRightId()))
            && (this.getRightName() == null ? other.getRightName() == null : this.getRightName().equals(other.getRightName()))
            && (this.getRightIcon() == null ? other.getRightIcon() == null : this.getRightIcon().equals(other.getRightIcon()))
            && (this.getLinkUrl() == null ? other.getLinkUrl() == null : this.getLinkUrl().equals(other.getLinkUrl()))
            && (this.getMenuType() == null ? other.getMenuType() == null : this.getMenuType().equals(other.getMenuType()))
            && (this.getOperType() == null ? other.getOperType() == null : this.getOperType().equals(other.getOperType()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getRequestUrl() == null ? other.getRequestUrl() == null : this.getRequestUrl().equals(other.getRequestUrl()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRightId() == null) ? 0 : getRightId().hashCode());
        result = prime * result + ((getRightName() == null) ? 0 : getRightName().hashCode());
        result = prime * result + ((getRightIcon() == null) ? 0 : getRightIcon().hashCode());
        result = prime * result + ((getLinkUrl() == null) ? 0 : getLinkUrl().hashCode());
        result = prime * result + ((getMenuType() == null) ? 0 : getMenuType().hashCode());
        result = prime * result + ((getOperType() == null) ? 0 : getOperType().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getRequestUrl() == null) ? 0 : getRequestUrl().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rightId=").append(rightId);
        sb.append(", rightName=").append(rightName);
        sb.append(", rightIcon=").append(rightIcon);
        sb.append(", linkUrl=").append(linkUrl);
        sb.append(", menuType=").append(menuType);
        sb.append(", operType=").append(operType);
        sb.append(", parentId=").append(parentId);
        sb.append(", requestUrl=").append(requestUrl);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}