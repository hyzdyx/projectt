package com.cdrail.service.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cdrail.service.entity.EduTeacher;
import com.cdrail.service.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author hyz
 * @since 2020-06-17
 */
@RestController
@RequestMapping("/service/edu-teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @RequestMapping("/getAllTeacher")
    public Map getAllTeacher(){
        List<EduTeacher> list = eduTeacherService.list(null);
        Map map = new HashMap<>();
        map.put("data", list);
        return map;
    }
}

