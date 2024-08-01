package com.practice.linux_project.service;

import com.practice.linux_project.domain.Person;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public Person getPersonCalledMike(){
        return new Person("Mike", "Alfonso", 23);
    }
}
