package com.gara.hellodemo.utils;

import com.gara.hellodemo.domain.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * @description: xsd生成工具类
 * @author: GaraYing
 * @create: 2018-08-30 09:37
 **/

public class XSDCreate {

    public CustomSchemaOutputResolver resolver;

    public static void main(String[] args) {
        XSDCreate xsdCreate = new XSDCreate();
        xsdCreate.resolver = xsdCreate.new CustomSchemaOutputResolver("F:\\schema", "student.xsd");

        Class[] classes = { Student.class };
        xsdCreate.createXSD(classes);

        System.out.println("all done");
    }

    public void createXSD(Class[] classes) {
        try {
            JAXBContext context = JAXBContext.newInstance(classes);
            context.generateSchema(resolver);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class CustomSchemaOutputResolver extends SchemaOutputResolver {

        private File file;

        public CustomSchemaOutputResolver(String dir, String fileName) {
            try {
                file = new File(dir, fileName);
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
            return new StreamResult(file);
        }

    }
}
