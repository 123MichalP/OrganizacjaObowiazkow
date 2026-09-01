package com.example.podzialobowiazkow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    @GetMapping
    public List<Person> getPerson(){
        return List.of(
                new Person(
                        1,
                        "Kazimiera",
                        "Parent"

                )
        );
    }
}
