package org.trmab;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("laptop")
@Primary
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Created");
    }

    @Override
    public void compiling(){
        System.out.println("Compiling using Laptop");
    }
}
