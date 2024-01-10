package com.jayasri;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jayasri.DAO.IStudentDao;
import com.jayasri.MODEL.StudentInfo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		
		IStudentDao dao = context.getBean(IStudentDao.class);
		
	/*	StudentInfo stud = new StudentInfo();
		stud.setStud_Id(24);
		stud.setStud_age(29);
		stud.setStud_gender("F");
		stud.setStud_name("Jayasri");*/
		
	/*	List<StudentInfo> students = new ArrayList<StudentInfo>();
		students.add(new StudentInfo(31,29,"M","Srinath"));
		students.add(new StudentInfo(32,30,"M","laksh"));
		students.add(new StudentInfo(33,31,"F","yuva"));
		students.add(new StudentInfo(34,32,"M","andhu"));
		students.add(new StudentInfo(35,33,"M","Suresh"));
		
		dao.saveAll(students);*/
		
		//retrieve data's from DB
		
		/* Iterable<StudentInfo> it = dao.findAll();
		 it.forEach(System.out::println);*/
		 
		 Optional<StudentInfo> it1 = dao.findById(34);
		 if(it1.isPresent()){
			 System.out.println(it1);
		 }
	}

}
