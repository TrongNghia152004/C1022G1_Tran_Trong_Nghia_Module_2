package ss08_mvc.service;

import ss08_mvc.model.Student;

public interface IStudentService {
    /*CRUD*/
    Student[] findAll();

    void addStudent(Student student);

    /*Validation*/

}
