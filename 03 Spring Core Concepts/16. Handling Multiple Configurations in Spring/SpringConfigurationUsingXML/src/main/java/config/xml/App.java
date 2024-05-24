package config.xml;

import config.xml.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "XML Main Started..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/beans/config.xml");
        Student student = context.getBean("student1", Student.class);
        student.sayHello();
    }
}
