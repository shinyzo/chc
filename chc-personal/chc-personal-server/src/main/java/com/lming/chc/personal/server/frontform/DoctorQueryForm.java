package com.lming.chc.personal.server.frontform;

import lombok.Data;

import java.io.Serializable;
@Data
public class DoctorQueryForm extends PageForm implements Serializable {

    private String doctorName;
}
