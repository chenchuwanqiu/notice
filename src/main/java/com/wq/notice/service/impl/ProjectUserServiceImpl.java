package com.wq.notice.service.impl;


import com.wq.notice.dao.ProjectUserDao;
import com.wq.notice.entity.ProjectUser;
import com.wq.notice.service.ProjectUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectUserServiceImpl implements ProjectUserService {
    @Autowired
    ProjectUserDao projectUserDao;

    @Override
    public List<ProjectUser> selectAll() {
        return projectUserDao.selectAll();
    }

    @Override
    public List<ProjectUser> selectId() {
        return projectUserDao.selectId("1");
    }


}
