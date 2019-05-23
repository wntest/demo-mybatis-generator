package com.wn.videoshow.generated;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class VideoInfoMapperTest {

    @Autowired
    private VideoInfoMapper videoInfoMapper;

    @Test
    public void deleteByPrimaryKey() {

    }

    @Test
    public void insert() {
        VideoInfo video = new VideoInfo();
        video.setId(1);
        video.setAge("22");
        video.setName("info");
        video.setInfoDetail("随便说点什么");
        videoInfoMapper.insert(video);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}