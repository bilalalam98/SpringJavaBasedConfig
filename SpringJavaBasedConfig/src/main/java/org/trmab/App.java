package org.trmab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.trmab.config.AppConfig;

public class App
{
    public static void main( String[] args )
    {

//        or we can use JavaBasedConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //here bean name is name of you method in AppConfig but it only if you didn't provide name to bean
        // annonation if you pass name to bean and change it from @Bean to @Bean(name = 'computer2') or
        // to pass multiple names @Bean(name = {"computer2"}) now you can use dt in name here and it will work
//        Desktop dt = context.getBean("desktop", Desktop.class);
        //now we know that by default it uses singleton now to change it to type prototype
        //here you can use @Scope("prototype") Annotation

        //now lets work with autowire here
//        Alien obj = (Alien) context.getBean("alien"); by name
        Alien obj = context.getBean(Alien.class); // by type
        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();

        //now lets say i dont want to work with AppConfig lets comment out everything there and i want to tell spring
        //handle every bean by your self the other way is Component Stereotype Annotation like place @Component to all the
        //classes you want to make object of now by only this it will give error as it will still do to our AppConfig file
        //so we can tell spring to first check for @Component for that we will have to write @ComponentScan at the top of
        //AppConfig and pass the package in it like @ComponentScan("com.trmab")


        //now the issue is obj.code() as there is not link for com

    }
}
