package com.wq.notice.dao;


import com.wq.notice.entity.ProjectUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectUserDao {

    List<ProjectUser> selectAll();

    List<ProjectUser> selectId(String Id);
}
