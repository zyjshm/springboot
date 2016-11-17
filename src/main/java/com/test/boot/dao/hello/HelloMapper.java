package com.test.boot.dao.hello;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.boot.entity.AreaBean;

@Repository
public interface HelloMapper {

    public List<AreaBean> queryAreaList();
}
