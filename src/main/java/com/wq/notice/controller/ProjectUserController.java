package com.wq.notice.controller;

import com.wq.notice.dao.ProjectUserDao;
import com.wq.notice.entity.ProjectUser;
import com.wq.notice.service.ProjectUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.List;


@RestController("project")
public class ProjectUserController {

    @Autowired
    ProjectUserService projectUserService;




    @RequestMapping("getUserAll")
    public String getUserAll(){
        List<ProjectUser> list=projectUserService.selectAll();
        System.out.println("数据库读取信息=======>"+list.get(0).getUsername());
        return "执行完毕";
    }


    @RequestMapping("getUserId")
    public String getUserId(){
        List<ProjectUser> list=projectUserService.selectId();
        System.out.println("数据库读取信息=======>"+list.get(0).getUsername());
        return "执行完毕";
    }























    @RequestMapping("/getUserExcel")
    public String getProjectUserAllExcel(HttpServletResponse response, HttpServletRequest request){


        List<ProjectUser> list=projectUserService.selectAll();
        System.out.println("数据库读取信息=======>"+list.get(0).getUsername());
        //定义导出的excel名字
        String excelName = "测试";

        return null;

    }


}
