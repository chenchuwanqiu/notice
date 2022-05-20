package com.wq.notice.service;


import com.wq.notice.entity.ProjectUser;

import java.util.List;


public interface ProjectUserService {
    List<ProjectUser> selectAll();

    List<ProjectUser> selectId();


}
