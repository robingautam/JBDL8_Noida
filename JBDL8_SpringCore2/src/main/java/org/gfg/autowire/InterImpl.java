package org.gfg.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InterImpl  implements InterA{
    @Override
    public String getMethod() {
        return "Interface implementation retrun";
    }
}
