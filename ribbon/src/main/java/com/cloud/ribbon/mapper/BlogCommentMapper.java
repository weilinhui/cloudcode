package com.cloud.ribbon.mapper;

import com.cloud.ribbon.pojo.BlogComment;

public interface BlogCommentMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(BlogComment record);

    int insertSelective(BlogComment record);

    BlogComment selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(BlogComment record);

    int updateByPrimaryKey(BlogComment record);
}