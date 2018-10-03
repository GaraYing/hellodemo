package com.gara.hellodemo.http.message;

import com.gara.hellodemo.domain.Person;
import com.gara.hellodemo.domain.User;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * @author GARA
 * @Title: PropertiesPersonHttpMessageConverter
 * @ProjectName hellodemo
 * @Description: TODO
 * @date 2018/10/3 23:04
 */
public class PropertiesPersonHttpMessageConverter extends AbstractHttpMessageConverter<Person> {

    public PropertiesPersonHttpMessageConverter() {
        super(MediaType.valueOf("application/properties+person"));
        setDefaultCharset(Charset.forName("UTF-8"));
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(Person.class);
    }

    /**
     * 将请求中的Properits内容转换成User对象
     *
     * @param clazz
     * @param inputMessage
     * @return
     * @throws IOException
     * @throws HttpMessageNotReadableException
     */
    @Override
    protected Person readInternal(Class<? extends Person> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        InputStream inputStream = inputMessage.getBody();

        // 將請求中的內容裝換成properties
        Properties properties = new Properties();
        properties.load(new InputStreamReader(inputStream, getDefaultCharset()));
        // 将Properties内容转换到Person对象中
        Person person = new Person();
        person.setPersonId(Long.valueOf(properties.getProperty("person.personid")));
        person.setName(properties.getProperty("person.name"));
        return person;
    }

    @Override
    protected void writeInternal(Person person, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        OutputStream outputStream = outputMessage.getBody();
        
        Properties properties = new Properties();
        properties.setProperty("person.personid",String.valueOf(person.getPersonId()));
        properties.setProperty("person.name",person.getName());
        properties.store(new OutputStreamWriter(outputStream,getDefaultCharset()),"written from web sever");
    }
}
