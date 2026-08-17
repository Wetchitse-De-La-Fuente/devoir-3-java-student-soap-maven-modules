package com.samanecorporation.soap.webservice.service;

import com.samanecorporation.metier.dto.StudentDto;
import com.samanecorporation.metier.service.IStudentService;
import com.samanecorporation.metier.service.StudentService;
import jakarta.jws.WebService;

@WebService(
        endpointInterface = "com.samanecorporation.soap.webservice.service.StudentWebService",
        serviceName = "StudentWebServiceService",
        portName = "StudentWebServicePort",
        targetNamespace = StudentWebService.NAMESPACE
)
public class StudentWebServiceImpl implements StudentWebService {
    private final IStudentService studentService = new StudentService();

    @Override
    public StudentDto getStudent(String matricule) {
        return studentService.getByMatricule(matricule);
    }

    @Override
    public StudentDto saveStudent(StudentDto student) {
        return studentService.save(student);
    }
}
