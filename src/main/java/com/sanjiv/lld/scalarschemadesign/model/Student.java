package com.sanjiv.lld.scalarschemadesign.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student extends BaseModel{
    private String name;
    private String address;
    private String phone_no;
    private String email;
    private String password;
    @ManyToMany
    List<Module> moduleList;
}
