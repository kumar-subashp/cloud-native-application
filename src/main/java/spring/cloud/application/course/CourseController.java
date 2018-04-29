package spring.cloud.application.course;

import spring.cloud.application.topic.Topic;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="courses", description="Courses supported operations")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @ApiOperation(value = "View a list of available Courses", response = List.class)
    @RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.GET)
    public List<Course> getAllCourses(@PathVariable String topicId){

        return courseService.getAllCourses(topicId);
    }

    @ApiOperation(value = "Get a Course")
    @RequestMapping(value = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.GET)
    public Course getCourse(@PathVariable String topicId, @PathVariable String courseId){

        return courseService.getCourse(topicId, courseId);
    }

    @ApiOperation(value = "Add a Course")
    @RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.POST)
    public void addCourse(@PathVariable String topicId, @RequestBody Course course){

        course.setTopic(new Topic(topicId, "",""));
        courseService.addCourse(course);
    }

    @ApiOperation(value = "Update a Course")
    @RequestMapping(value = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String courseId){

        course.setTopic(new Topic(topicId, "",""));
        courseService.updateCourse(course);
    }

    @ApiOperation(value = "Delete a Course")
    @RequestMapping(value = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.DELETE)
    public void deleteCourse(@RequestBody Course course, @PathVariable String courseId){

        courseService.deleteCourse(course);
    }
}
