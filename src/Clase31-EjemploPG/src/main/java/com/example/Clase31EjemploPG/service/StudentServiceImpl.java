package com.example.Clase31EjemploPG.service;

import com.example.Clase31EjemploPG.entity.Student;
import com.example.Clase31EjemploPG.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService{
    IStudentRepository iStudentRepository;

    public StudentServiceImpl(IStudentRepository studentRepository) {
        this.iStudentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return iStudentRepository.findAll();
    }

    @Override
    public Optional<Student> findStudentById(Long id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public Student saveStudent(Student studentNew) {
        if (studentNew != null){
            return iStudentRepository.save(studentNew);
        }
        return new Student();
    }

    @Override
    public String deleteStudent(Long id) {
        if (iStudentRepository.existsById(id)){
            iStudentRepository.deleteById(id);
            return "Objeto eliminado con ID: " + id;
        }
        return "Objeto con ID: " + id + " no existe!";
    }

    @Override
    public String updateStudent(Student studentNew) {
        return null;
    }
}
