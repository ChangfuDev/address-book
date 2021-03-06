package com.ysk.addressbook.dao;

import com.ysk.addressbook.entity.Classes;
import com.ysk.addressbook.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassesDao {
     List<Classes> findAllClasses();

     void addOneClasses(Classes classes);

    void updateOneClasses(Classes classes);

    void deleteOneClasses(@Param("classesNum") String classesNum);

    Classes getOneClasses(@Param("classesNum") String classesNum);

    List<Student> getClassesByClassesNum(@Param("classesNum") String classesNum);



}
