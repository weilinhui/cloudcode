package com.cloud.ribbon.mapper;

import com.cloud.ribbon.pojo.BlogPicture;

public interface BlogPictureMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(BlogPicture record);

    int insertSelective(BlogPicture record);

    BlogPicture selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(BlogPicture record);

    int updateByPrimaryKey(BlogPicture record);
}