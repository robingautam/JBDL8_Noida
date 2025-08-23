package org.gfg.JBDL8_JUnitAndMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ObjectModificationTest {

    @Autowired
    ObjectModification objectModification;

    @Test
    void getCharOfName() {
        Person person = new Person();
        person.setName("Robin");
        char actual = objectModification.getCharOfName(person);
        Assertions.assertEquals('R',actual);

    }
}