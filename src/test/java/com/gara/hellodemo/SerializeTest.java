package com.gara.hellodemo;

import com.gara.hellodemo.domain.User;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;
import java.util.Date;
import java.util.UUID;

/**
 * @program: SerializeTest
 * @description: Java序列化测试类
 * @author: GaraYing
 * @create: 2018-07-31 16:25
 **/
public class SerializeTest {
    public static void main(String[] args) {
        User user = new User();
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        user.setUserName("Gara");
        user.setBirthday(new Date());
        user.setGender("M");
        user.setAge(24);
        System.out.println(user.toString());

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("tempfile"));
            oos.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(oos);
        }

        //Read Obj from File
        File file = new File("tempFile");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            User newUser = (User) ois.readObject();
            System.out.println(newUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(ois);
            try {
                FileUtils.forceDelete(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
