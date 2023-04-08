package com.hnust.service.impl;

import com.hnust.dao.CourseDao;
import com.hnust.domain.Course;
import com.hnust.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;
    public Course findCourseByCid(Integer cid){
         return courseDao.findCourseByCid(cid);
    }
    public List<Course> findCourseBySid(Integer sid){
        return courseDao.findCourseBySid(sid);
    }
    public String updateHours(Course course){
        return "影响了" + courseDao.updateHours(course) + "条数据";
    }
    public String insertIntoCourse(Course course){
        return "影响了" + courseDao.insertIntoCourse(course) + "条数据";
    }
    public List<Course> selectAll(){
        return courseDao.selectAll();
    }
}
