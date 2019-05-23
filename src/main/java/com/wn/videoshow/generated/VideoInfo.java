package com.wn.videoshow.generated;

import java.io.Serializable;

public class VideoInfo implements Serializable {
    private Integer id;

    private String name;

    private String age;

    private String infoDetail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getInfoDetail() {
        return infoDetail;
    }

    public void setInfoDetail(String infoDetail) {
        this.infoDetail = infoDetail == null ? null : infoDetail.trim();
    }
}