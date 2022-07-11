package com.sanjiv.lld.scalarschemadesign.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class ModuleExam extends BaseModel{
    @ManyToOne
    private Module module;

    @ManyToOne
    private Exam exam;

    private Date date;
}
