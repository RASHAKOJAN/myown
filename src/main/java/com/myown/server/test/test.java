package com.myown.server.test;

import com.myown.server.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args){

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = (Person) app.getBean("p");

        p.display();

    }


}
