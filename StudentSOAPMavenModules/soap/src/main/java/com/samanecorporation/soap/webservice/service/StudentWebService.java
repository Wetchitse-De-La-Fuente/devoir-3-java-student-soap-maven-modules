package com.samanecorporation.soap.webservice.service;

import com.samanecorporation.metier.dto.StudentDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;
import jakarta.xml.ws.soap.SOAPBinding;

@WebService(
        name = "StudentWebService",
        targetNamespace = StudentWebService.NAMESPACE
)
@SOAPBinding(
        style = SOAPBinding.Style.DOCUMENT,
        use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED
)
public interface StudentWebService {
    String NAMESPACE = "http://service.webservice.soap.samanecorporation.com/";

    @WebMethod(operationName = "studentRequestGet")
    @RequestWrapper(localName = "studentRequestGet", targetNamespace = NAMESPACE)
    @ResponseWrapper(localName = "studentResponseGet", targetNamespace = NAMESPACE)
    @WebResult(name = "student", targetNamespace = "")
    StudentDto getStudent(@WebParam(name = "matricule", targetNamespace = "") String matricule);

    @WebMethod(operationName = "studentRequestSav")
    @RequestWrapper(localName = "studentRequestSav", targetNamespace = NAMESPACE)
    @ResponseWrapper(localName = "studentResponseSav", targetNamespace = NAMESPACE)
    @WebResult(name = "student", targetNamespace = "")
    StudentDto saveStudent(@WebParam(name = "student", targetNamespace = "") StudentDto student);
}
