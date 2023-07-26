package com.example.raw;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    /*
     * cannot use name in @Autowired
     */
    @Resource(name = "animal1")
    private Animal animal1;

    @Resource(name = "animal2")
    private Animal animal2;

    public void printNames() {
        System.out.println(animal1.getName() + " " + animal2.getName());
    }
}
