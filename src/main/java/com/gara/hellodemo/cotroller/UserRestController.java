package com.gara.hellodemo.cotroller;

import com.gara.hellodemo.domain.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GARA
 * @Title: UserRestController
 * @ProjectName hellodemo
 * @Description: TODO
 * @date 2018/10/4 0:09
 */
@RestController
public class UserRestController {
    /**
     * JsonToProperties
     * @param person
     * @return
     */
    @PostMapping(value = "person/json/to/properties",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, // consumes 对应请求头中 ContentType
            produces = "application/properties+person" // produces 对应请求头中 Accept
            /**
             * 请求实例： [
             * {"key":"Content-Type","value":"application/json","description":""},
             * {"key":"Accept","value":"application/properties+person","description":"","enabled":true}
             * ]
            */
    )
    public Person personJsonToProperties(@RequestBody Person person){
        // RequestBody 的请求类型是Json
        // 相应类型是 Properties
        return person;
    }

    /**
     * PropertiesToJson
     * @param person
     * @return
     */
    @PostMapping(value = "person/properties/to/json",
            consumes = "application/properties+person",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public Person personPropertiesToJson(@RequestBody Person person){
        // RequestBody 的请求类型是Properties
        // 相应类型是 Json
        return person;
    }
}
