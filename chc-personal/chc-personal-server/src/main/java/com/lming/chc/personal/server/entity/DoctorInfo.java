package com.lming.chc.personal.server.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * doctor_info
 * @author 
 */
public class DoctorInfo extends DoctorInfoKey implements Serializable {
    /**
     * 登录账号
     */
    private Integer user_id;

    /**
     * 医生姓名
     */
    private String doctor_name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 头像图片
     */
    private String avatar;

    /**
     * 医师资格证书编号
     */
    private String qafca_cert_no;

    /**
     * 医师资格证书图片
     */
    private String qafca_cert_img;

    /**
     * 发证日期
     */
    private String qafca_cert_sign_date;

    /**
     * 执业资格证书
     */
    private String pract_cert_no;

    /**
     * 执业资格证书图片
     */
    private String pract_cert_img;

    /**
     * 执业资格证书注册日期
     */
    private String pract_cert_register_date;

    /**
     * 医院
     */
    private Integer hospital_id;

    private String hospital_name;

    /**
     * 科室id
     */
    private String subject_id;

    /**
     * 科室名称
     */
    private String subject_name;

    /**
     * 职务级别
     */
    private String level_id;

    private String level_name;

    /**
     * 医师编号
     */
    private String doctor_no;

    /**
     * 大学名称
     */
    private String college_name;

    /**
     * 工作年限
     */
    private String work_age;

    /**
     * 擅长领域
     */
    private String fav_subject;

    /**
     * 办公电话-固话
     */
    private String office_phone;

    /**
     * 个人电话
     */
    private String personal_phone;

    /**
     * 状态
     */
    private String status;

    /**
     * 数据录入方式1：内部录入，0：个人注册
     */
    private String input_type;

    /**
     * 医师简介
     */
    private String description;

    private Float score;

    private Date create_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getQafca_cert_no() {
        return qafca_cert_no;
    }

    public void setQafca_cert_no(String qafca_cert_no) {
        this.qafca_cert_no = qafca_cert_no;
    }

    public String getQafca_cert_img() {
        return qafca_cert_img;
    }

    public void setQafca_cert_img(String qafca_cert_img) {
        this.qafca_cert_img = qafca_cert_img;
    }

    public String getQafca_cert_sign_date() {
        return qafca_cert_sign_date;
    }

    public void setQafca_cert_sign_date(String qafca_cert_sign_date) {
        this.qafca_cert_sign_date = qafca_cert_sign_date;
    }

    public String getPract_cert_no() {
        return pract_cert_no;
    }

    public void setPract_cert_no(String pract_cert_no) {
        this.pract_cert_no = pract_cert_no;
    }

    public String getPract_cert_img() {
        return pract_cert_img;
    }

    public void setPract_cert_img(String pract_cert_img) {
        this.pract_cert_img = pract_cert_img;
    }

    public String getPract_cert_register_date() {
        return pract_cert_register_date;
    }

    public void setPract_cert_register_date(String pract_cert_register_date) {
        this.pract_cert_register_date = pract_cert_register_date;
    }

    public Integer getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(Integer hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getLevel_id() {
        return level_id;
    }

    public void setLevel_id(String level_id) {
        this.level_id = level_id;
    }

    public String getLevel_name() {
        return level_name;
    }

    public void setLevel_name(String level_name) {
        this.level_name = level_name;
    }

    public String getDoctor_no() {
        return doctor_no;
    }

    public void setDoctor_no(String doctor_no) {
        this.doctor_no = doctor_no;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getWork_age() {
        return work_age;
    }

    public void setWork_age(String work_age) {
        this.work_age = work_age;
    }

    public String getFav_subject() {
        return fav_subject;
    }

    public void setFav_subject(String fav_subject) {
        this.fav_subject = fav_subject;
    }

    public String getOffice_phone() {
        return office_phone;
    }

    public void setOffice_phone(String office_phone) {
        this.office_phone = office_phone;
    }

    public String getPersonal_phone() {
        return personal_phone;
    }

    public void setPersonal_phone(String personal_phone) {
        this.personal_phone = personal_phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInput_type() {
        return input_type;
    }

    public void setInput_type(String input_type) {
        this.input_type = input_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
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
        DoctorInfo other = (DoctorInfo) that;
        return (this.getDoctor_id() == null ? other.getDoctor_id() == null : this.getDoctor_id().equals(other.getDoctor_id()))
            && (this.getId_card_no() == null ? other.getId_card_no() == null : this.getId_card_no().equals(other.getId_card_no()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getDoctor_name() == null ? other.getDoctor_name() == null : this.getDoctor_name().equals(other.getDoctor_name()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getQafca_cert_no() == null ? other.getQafca_cert_no() == null : this.getQafca_cert_no().equals(other.getQafca_cert_no()))
            && (this.getQafca_cert_img() == null ? other.getQafca_cert_img() == null : this.getQafca_cert_img().equals(other.getQafca_cert_img()))
            && (this.getQafca_cert_sign_date() == null ? other.getQafca_cert_sign_date() == null : this.getQafca_cert_sign_date().equals(other.getQafca_cert_sign_date()))
            && (this.getPract_cert_no() == null ? other.getPract_cert_no() == null : this.getPract_cert_no().equals(other.getPract_cert_no()))
            && (this.getPract_cert_img() == null ? other.getPract_cert_img() == null : this.getPract_cert_img().equals(other.getPract_cert_img()))
            && (this.getPract_cert_register_date() == null ? other.getPract_cert_register_date() == null : this.getPract_cert_register_date().equals(other.getPract_cert_register_date()))
            && (this.getHospital_id() == null ? other.getHospital_id() == null : this.getHospital_id().equals(other.getHospital_id()))
            && (this.getHospital_name() == null ? other.getHospital_name() == null : this.getHospital_name().equals(other.getHospital_name()))
            && (this.getSubject_id() == null ? other.getSubject_id() == null : this.getSubject_id().equals(other.getSubject_id()))
            && (this.getSubject_name() == null ? other.getSubject_name() == null : this.getSubject_name().equals(other.getSubject_name()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getLevel_name() == null ? other.getLevel_name() == null : this.getLevel_name().equals(other.getLevel_name()))
            && (this.getDoctor_no() == null ? other.getDoctor_no() == null : this.getDoctor_no().equals(other.getDoctor_no()))
            && (this.getCollege_name() == null ? other.getCollege_name() == null : this.getCollege_name().equals(other.getCollege_name()))
            && (this.getWork_age() == null ? other.getWork_age() == null : this.getWork_age().equals(other.getWork_age()))
            && (this.getFav_subject() == null ? other.getFav_subject() == null : this.getFav_subject().equals(other.getFav_subject()))
            && (this.getOffice_phone() == null ? other.getOffice_phone() == null : this.getOffice_phone().equals(other.getOffice_phone()))
            && (this.getPersonal_phone() == null ? other.getPersonal_phone() == null : this.getPersonal_phone().equals(other.getPersonal_phone()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getInput_type() == null ? other.getInput_type() == null : this.getInput_type().equals(other.getInput_type()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoctor_id() == null) ? 0 : getDoctor_id().hashCode());
        result = prime * result + ((getId_card_no() == null) ? 0 : getId_card_no().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getDoctor_name() == null) ? 0 : getDoctor_name().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getQafca_cert_no() == null) ? 0 : getQafca_cert_no().hashCode());
        result = prime * result + ((getQafca_cert_img() == null) ? 0 : getQafca_cert_img().hashCode());
        result = prime * result + ((getQafca_cert_sign_date() == null) ? 0 : getQafca_cert_sign_date().hashCode());
        result = prime * result + ((getPract_cert_no() == null) ? 0 : getPract_cert_no().hashCode());
        result = prime * result + ((getPract_cert_img() == null) ? 0 : getPract_cert_img().hashCode());
        result = prime * result + ((getPract_cert_register_date() == null) ? 0 : getPract_cert_register_date().hashCode());
        result = prime * result + ((getHospital_id() == null) ? 0 : getHospital_id().hashCode());
        result = prime * result + ((getHospital_name() == null) ? 0 : getHospital_name().hashCode());
        result = prime * result + ((getSubject_id() == null) ? 0 : getSubject_id().hashCode());
        result = prime * result + ((getSubject_name() == null) ? 0 : getSubject_name().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getLevel_name() == null) ? 0 : getLevel_name().hashCode());
        result = prime * result + ((getDoctor_no() == null) ? 0 : getDoctor_no().hashCode());
        result = prime * result + ((getCollege_name() == null) ? 0 : getCollege_name().hashCode());
        result = prime * result + ((getWork_age() == null) ? 0 : getWork_age().hashCode());
        result = prime * result + ((getFav_subject() == null) ? 0 : getFav_subject().hashCode());
        result = prime * result + ((getOffice_phone() == null) ? 0 : getOffice_phone().hashCode());
        result = prime * result + ((getPersonal_phone() == null) ? 0 : getPersonal_phone().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getInput_type() == null) ? 0 : getInput_type().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user_id=").append(user_id);
        sb.append(", doctor_name=").append(doctor_name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", avatar=").append(avatar);
        sb.append(", qafca_cert_no=").append(qafca_cert_no);
        sb.append(", qafca_cert_img=").append(qafca_cert_img);
        sb.append(", qafca_cert_sign_date=").append(qafca_cert_sign_date);
        sb.append(", pract_cert_no=").append(pract_cert_no);
        sb.append(", pract_cert_img=").append(pract_cert_img);
        sb.append(", pract_cert_register_date=").append(pract_cert_register_date);
        sb.append(", hospital_id=").append(hospital_id);
        sb.append(", hospital_name=").append(hospital_name);
        sb.append(", subject_id=").append(subject_id);
        sb.append(", subject_name=").append(subject_name);
        sb.append(", level_id=").append(level_id);
        sb.append(", level_name=").append(level_name);
        sb.append(", doctor_no=").append(doctor_no);
        sb.append(", college_name=").append(college_name);
        sb.append(", work_age=").append(work_age);
        sb.append(", fav_subject=").append(fav_subject);
        sb.append(", office_phone=").append(office_phone);
        sb.append(", personal_phone=").append(personal_phone);
        sb.append(", status=").append(status);
        sb.append(", input_type=").append(input_type);
        sb.append(", description=").append(description);
        sb.append(", score=").append(score);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}