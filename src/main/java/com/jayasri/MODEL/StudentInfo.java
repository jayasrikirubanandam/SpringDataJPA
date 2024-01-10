package com.jayasri.MODEL;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "student_info")
public class StudentInfo {

	
	@Id
	private int stud_Id;
	
	private int stud_age;
	private String stud_gender;
	private String stud_name;
	
	
	public StudentInfo() {
		super();
	}
	
	public StudentInfo(int stud_Id, int stud_age, String stud_gender, String stud_name) {
		super();
		this.stud_Id = stud_Id;
		this.stud_age = stud_age;
		this.stud_gender = stud_gender;
		this.stud_name = stud_name;
	}


	
	
	
	
}
