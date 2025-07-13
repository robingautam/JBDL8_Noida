package org.gfg.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("custom")
public class CustomClass {

    @Autowired
    InterA inter;


}
