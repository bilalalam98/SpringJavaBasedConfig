package org.trmab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    // also if this age is not provided and you want to set deault value you can use Value Annotation
    @Value("23")
    private int age;

    //its field Injection but if its being set on contructor and you write AutoWire there its Constructor inject
//    @Autowired
//    @Qualifier("desktop") to solve expected one but got two
    private Computer com;

    public Alien(){
        System.out.println("Alien created");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    //this is an setter Injection its prefered
    @Autowired
    @Qualifier("desktop")// even if primary if you set Qualifier it gets poreference
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.print("Coding");
        com.compiling();
    }
}
