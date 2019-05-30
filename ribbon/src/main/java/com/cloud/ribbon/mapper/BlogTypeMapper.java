package com.cloud.ribbon.mapper;

import com.cloud.ribbon.pojo.BlogType;

public interface BlogTypeMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(BlogType record);

    int insertSelective(BlogType record);

    BlogType selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(BlogType record);

    int updateByPrimaryKey(BlogType record);
}