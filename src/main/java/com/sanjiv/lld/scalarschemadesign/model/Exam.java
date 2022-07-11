package com.sanjiv.lld.scalarschemadesign.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Exam extends BaseModel{
    private int duration;
    private String name;
}
