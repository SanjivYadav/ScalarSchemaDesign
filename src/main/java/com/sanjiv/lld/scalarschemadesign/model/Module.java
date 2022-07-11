package com.sanjiv.lld.scalarschemadesign.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Module extends BaseModel{
    private String name;
    @ManyToMany(mappedBy = "moduleList")
    List<Student> students;
}
