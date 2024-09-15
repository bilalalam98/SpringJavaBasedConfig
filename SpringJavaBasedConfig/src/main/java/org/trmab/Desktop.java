package org.trmab;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("desktop")
@Scope("prototype") //scope can be provided like this
public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop Created");
    }

    @Override
    public void compiling(){
        System.out.println("Compiling using Desktop");
    }
}
