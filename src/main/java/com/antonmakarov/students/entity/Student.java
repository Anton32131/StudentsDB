package com.antonmakarov.students.entity;

import javax.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "middlename")
    private String middlename;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "birthday")
    private String birthday;
    @Column(name = "groupnumber")
    private int groupnumber;

    public Student() {
    }

    public Student(String name, String middlename, String lastname, String birthday, int groupnumber) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.birthday = birthday;
        this.groupnumber = groupnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(int groupnumber) {
        this.groupnumber = groupnumber;
    }
}
