package org.gfg.JBDL8_JUnitAndMockito.Mockito;

import org.springframework.stereotype.Component;

@Component
public class ApiCall {

    public String getResponse(){
        return "Response";
    }

    public String getResponse2(){
        return "Response 2";
    }
}
