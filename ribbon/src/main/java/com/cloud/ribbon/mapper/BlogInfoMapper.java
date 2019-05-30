package com.cloud.ribbon.mapper;

import com.cloud.ribbon.pojo.BlogInfo;

public interface BlogInfoMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(BlogInfo record);

    int insertSelective(BlogInfo record);

	BlogInfo selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(BlogInfo record);

    int updateByPrimaryKeyWithBLOBs(BlogInfo record);

    int updateByPrimaryKey(BlogInfo record);
}