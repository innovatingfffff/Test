package com.hnust.domain;

import java.io.Serializable;
import java.util.List;

public class School implements Serializable {
    private int id;
    private String school_name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", school_name='" + school_name + '\'' +
                '}';
    }
}

