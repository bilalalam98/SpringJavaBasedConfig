package org.trmab.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.trmab.Alien;
import org.trmab.Computer;
import org.trmab.Desktop;
import org.trmab.Laptop;

@Configuration
@ComponentScan("org.trmab")
public class AppConfig {
//
//    //the below Desktop will be created , injected and managed by spring frame work
////    @Bean(name={"computer2", "desktop1", "Beast"})
//    @Bean
//    @Scope("singleton")
//    public Desktop desktop(){
//        //we are only writting the below code but believe me it will be handle by spring
//         return new Desktop();
//    }
//
//    //writting Autowiring annotation is optional it was compulsory in previous versions
////    public Alien alien(@Qualifier("desktop") Computer com){
////    @Qualifier("desktop") means passing ref to it or you can use @Primary to Desktop or laptop
//
//    @Bean
//    public Alien alien(Computer com){
//
//        //inorder to provide age and com
//        Alien obj = new Alien();
//        obj.setAge(25);
////        obj.setCom(desktop());
//        //by doing it like below we are making it tightly couple so lets do it like
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
