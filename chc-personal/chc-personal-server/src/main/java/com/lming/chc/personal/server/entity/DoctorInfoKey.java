package com.lming.chc.personal.server.entity;

import java.io.Serializable;

/**
 * doctor_info
 * @author 
 */
public class DoctorInfoKey implements Serializable {
    /**
     * 系统主键
     */
    private Integer doctor_id;

    /**
     * 身份证号
     */
    private String id_card_no;

    private static final long serialVersionUID = 1L;

    public Integer getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Integer doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getId_card_no() {
        return id_card_no;
    }

    public void setId_card_no(String id_card_no) {
        this.id_card_no = id_card_no;
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
        DoctorInfoKey other = (DoctorInfoKey) that;
        return (this.getDoctor_id() == null ? other.getDoctor_id() == null : this.getDoctor_id().equals(other.getDoctor_id()))
            && (this.getId_card_no() == null ? other.getId_card_no() == null : this.getId_card_no().equals(other.getId_card_no()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoctor_id() == null) ? 0 : getDoctor_id().hashCode());
        result = prime * result + ((getId_card_no() == null) ? 0 : getId_card_no().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctor_id=").append(doctor_id);
        sb.append(", id_card_no=").append(id_card_no);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}