package com.practice.linux_project.controller;

import com.practice.linux_project.domain.Person;
import com.practice.linux_project.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/person")
public class PersonController {
    private TestService testService;

    public PersonController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("")
    public ResponseEntity<Person> getMike(){
        Person mike = testService.getPersonCalledMike();
        return new ResponseEntity<>(mike, HttpStatus.OK);
    }
}
