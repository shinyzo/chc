package com.lming.chc.personal.server.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class DoctorInfo implements Serializable {

    private Integer doctorId;

    private String doctorName;

}
