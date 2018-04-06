package com.lming.chc.personal.server.entity;

import java.io.Serializable;

/**
 * acl_mobile_rights
 * @author 
 */
public class AclMobileRights implements Serializable {
    private String navId;

    private String navName;

    private String type;

    private String linkUrl;

    private String icon;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public String getNavId() {
        return navId;
    }

    public void setNavId(String navId) {
        this.navId = navId;
    }

    public String getNavName() {
        return navName;
    }

    public void setNavName(String navName) {
        this.navName = navName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
        AclMobileRights other = (AclMobileRights) that;
        return (this.getNavId() == null ? other.getNavId() == null : this.getNavId().equals(other.getNavId()))
            && (this.getNavName() == null ? other.getNavName() == null : this.getNavName().equals(other.getNavName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getLinkUrl() == null ? other.getLinkUrl() == null : this.getLinkUrl().equals(other.getLinkUrl()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNavId() == null) ? 0 : getNavId().hashCode());
        result = prime * result + ((getNavName() == null) ? 0 : getNavName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getLinkUrl() == null) ? 0 : getLinkUrl().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", navId=").append(navId);
        sb.append(", navName=").append(navName);
        sb.append(", type=").append(type);
        sb.append(", linkUrl=").append(linkUrl);
        sb.append(", icon=").append(icon);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}