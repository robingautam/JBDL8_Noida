package org.gfg.JBDL8_JUnitAndMockito.Mockito;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {


    public Person findPersonById(int id){
        return new Person();
    }
}
