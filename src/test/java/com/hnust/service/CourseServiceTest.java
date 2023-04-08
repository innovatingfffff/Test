package com.hnust.service;

import com.hnust.config.SpringConfig;
import com.hnust.domain.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class CourseServiceTest {
    @Autowired
    private CourseService courseService;
    @Test
    public void testFindCourseByCid(){
        System.out.println(courseService.findCourseByCid(2));
    }
    @Test
    public void testFindCourseBySid(){
        System.out.println(courseService.findCourseBySid(1));
    }
    @Test
    public void testUpdateHours(){
        Course course = new Course();
        course.setHours(44);
        course.setId(4);
        System.out.println(courseService.updateHours(course));
    }
    @Test
    public void testInsertIntoCourse(){
        Course course = new Course();
        course.setName("大数据存储");
        course.setHours(32);
        course.setSchools(1);
        System.out.println(courseService.insertIntoCourse(course));
    }
    @Test
    public void testSelectAll(){
        System.out.println(courseService.selectAll());
    }
}
