package com.sathish83.jsonparsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sathish83.jsonparsing.model.Employee;

public class TestApplication {

    public static void main(String[] args) throws JsonProcessingException {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Casino");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(employee));
    }
}
