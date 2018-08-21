package com.gara.hellodemo.domain;

/**
 * @description:
 * @author: GaraYing
 * @create: 2018-08-21 18:38
 **/

public class Person {

    private Long personId;

    private String name;

    public Person() {
    }

    public Person(Long personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
