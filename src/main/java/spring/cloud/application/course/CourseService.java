package spring.cloud.application.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by subashparida on 28/04/18.
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){

        List<Course> result = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(result::add);
        return result;
    }

    public Course getCourse(String topicId,  final String courseId){
        return courseRepository.findByTopicId(topicId).stream().filter(course -> course.getId().equalsIgnoreCase(courseId)).findFirst().get();
    }

    public void addCourse(Course course){

        courseRepository.save(course);
    }

    public void updateCourse(Course course){

        courseRepository.save(course);
    }

    public void deleteCourse(Course course){
        courseRepository.delete(course);
    }
}
