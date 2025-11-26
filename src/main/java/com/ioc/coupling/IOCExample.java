package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIOCLooseCouplingExample.xml");

        UserManager userManagerwithDB =(UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerwithDB.getUserInfo());

        UserManager userManagerWithWS =(UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userManagerWithWS.getUserInfo());
    }
}
