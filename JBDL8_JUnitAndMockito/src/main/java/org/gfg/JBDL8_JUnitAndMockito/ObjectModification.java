package org.gfg.JBDL8_JUnitAndMockito;

import org.springframework.stereotype.Component;

@Component
public class ObjectModification {

    public char getCharOfName(Person person){
        String name = person.getName();
        return name.charAt(0);
    }

}
