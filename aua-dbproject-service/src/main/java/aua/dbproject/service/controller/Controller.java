package aua.dbproject.service.controller;

import aua.dbproject.common.dto.CourseDto;
import aua.dbproject.common.filter.CourseFilters;
import aua.dbproject.service.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hrachyayeghishyan on 11/30/17.
 */
@RestController
public class Controller {
    @Autowired
    CourseService courseService;


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public List<CourseDto> deps(@RequestBody CourseFilters courseFilters){
        return courseService.getCsCourseList(courseFilters);
    }
}
