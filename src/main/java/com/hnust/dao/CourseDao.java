package com.hnust.dao;

import com.hnust.domain.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CourseDao {
    @Select("select * from c_course where id = #{id}")
    Course findCourseByCid(Integer id);
    @Select(" select * from c_course where schools = #{id}")
    List<Course> findCourseBySid(Integer id);
    @Update("update c_course set hours = #{hours} where id = #{id}")
    Integer updateHours(Course course);
    @Insert("insert into c_course(name,hours,schools) values (#{name}, #{hours}, #{schools})")
    Integer insertIntoCourse(Course course);
    @Select("select * from c_course")
    List<Course> selectAll();
}
