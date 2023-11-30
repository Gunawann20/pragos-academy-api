package org.binar.pragosacademyapi.service;

import org.binar.pragosacademyapi.entity.dto.CourseDetailDto;
import org.binar.pragosacademyapi.entity.dto.CourseDto;
import org.binar.pragosacademyapi.entity.response.Response;

import java.util.List;

public interface CourseService {
    Response<List<CourseDto>> listAllCourse();
    Response<CourseDetailDto> courseDetail(String courseCode);
    Response<List<CourseDto>>filter(String type);
    Response<String> enrollCourse(String courseCode);
  
}
