package com.hnust.service;

import com.hnust.domain.Course;

import java.util.List;

public interface CourseService {
    public Course findCourseByCid(Integer id);
    public List<Course> findCourseBySid(Integer id);
    public String updateHours(Course course);
    public String insertIntoCourse(Course course);
    public List<Course> selectAll();
}
