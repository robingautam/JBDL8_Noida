package org.gfg.autowire;

import org.springframework.stereotype.Component;

@Component
public class AnotherImpl implements InterA{
    @Override
    public String getMethod() {
        return "Another implementation";
    }
}
