package com.gara.hellodemo;

import com.gara.hellodemo.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @description:
 * @author: GaraYing
 * @create: 2018-08-21 18:42
 **/

@Repository
public class PersonRepository {

    private final ConcurrentMap<Long,Person> repository = new ConcurrentHashMap<>();

    // 保证数据操作的原子性
    private AtomicLong idGenernator = new AtomicLong();

    public Boolean save(Person person){
        // Id 从1开始
        Long id = idGenernator.incrementAndGet();
        person.setPersonId(id);
        return repository.put(id, person) == null;
    }

    // 集合不可更改
    public Collection<Person> findAll(){
        return repository.values();
    }

}
