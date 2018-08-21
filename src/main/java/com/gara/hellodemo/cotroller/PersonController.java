package com.gara.hellodemo.cotroller;

import com.gara.hellodemo.PersonRepository;
import com.gara.hellodemo.cotroller.base.BaseController;
import com.gara.hellodemo.domain.Person;
import com.gara.hellodemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-21 18:49
 **/

@RestController
public class PersonController extends BaseController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @PostMapping("/user/save")
    public Person person(@RequestParam String name){
        Person person = new Person();
        person.setName(name);
        personRepository.save(person);
        return person;
    }
}
