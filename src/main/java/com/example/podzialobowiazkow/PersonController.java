package com.example.podzialobowiazkow;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    @GetMapping
//    public List<Person> getPerson(){
//        return List.of(
//                new Person(
//                        1,
//                        "Kazimiera",
//                        "Parent"
//                )
//        );
//    }

    @PostMapping
    public Person addPerson(@RequestBody Person person){
        return person;
    }
}
