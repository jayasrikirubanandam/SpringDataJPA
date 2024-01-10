package com.jayasri.DAO;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jayasri.MODEL.StudentInfo;

@Repository
public interface IStudentDao extends CrudRepository<StudentInfo, Serializable>  {

}
