//package com.accolite.course;
//
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.accolite.course.entities.CourseEntity;
//import com.accolite.course.entities.Creator;
//import com.accolite.course.entities.Skill;
//import com.accolite.course.models.Course;
//import com.accolite.course.repositories.CourseRepository;
//import com.accolite.course.repositories.CreatorRepository;
//import com.accolite.course.repositories.SkillRepository;
//import com.accolite.course.service.CourseService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class CourseApplicationTests {
//	
//	@Autowired
//	private CourseService service;
//	
//	@MockBean
//	private CourseRepository courseRepo;
//	
//	@MockBean
//	private CreatorRepository creatorRepo;
//	
//	@MockBean
//	private SkillRepository skillRepo;
//	
//	@Test
//	public void saveIntocourseItemTabletest() {
//		String location = "Delhi";
//		List<Skill> skills = new ArrayList<>();
//		Skill skill = new Skill(1,"skill");
//		skills.add(skill);
//		List<Creator> creators = new ArrayList<>();
//		Creator creator = new Creator(1,"skill");
//		creators.add(creator);
//		CourseEntity course = new CourseEntity();
//		
//		when(courseRepo.save(course)).thenReturn(course);
//		assertEquals(course ,service.saveIntocourseItemTable(course));
//	}
//	
//	@Test
//	public void fetchCoursesByLocationtest() {
//		String location = "Delhi";
//		List<Skill> skills = new ArrayList<>();
//		Skill skill = new Skill(1,"skill");
//		skills.add(skill);
//		List<Creator> creators = new ArrayList<>();
//		Creator creator = new Creator(1,"skill");
//		creators.add(creator);
//		Course course = new Course();
//		
//		when(courseRepo.findByLocation(location)).thenReturn(Stream.of(course).collect(Collectors.toList()));
//		assertEquals(1,service.fetchCoursesByLocation(location).size(course));
//		
//	}
//}
