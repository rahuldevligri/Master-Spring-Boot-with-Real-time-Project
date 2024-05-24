package com.proxymode.bean.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//1st way bean scope by default singleton
@Component
//@Scope("singleton") // 2nd way we can manually define scope of the bean using @Scope annotation
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)// 3rd way we can manually define nam e of the type in @Scope annotation
public class Pepsi {

    @Autowired
    private Soda soda;

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    public Pepsi(){
        System.out.println("Pepsi Object Created....");
    }

    public void drink(){
        System.out.println("Pepsi is very cool...");
    }
}
