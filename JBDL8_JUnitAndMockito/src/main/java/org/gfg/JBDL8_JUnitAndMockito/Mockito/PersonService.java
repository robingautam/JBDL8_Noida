package org.gfg.JBDL8_JUnitAndMockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public String verifyPersonNameAndEmail(int id){
        Person person = personRepository.findPersonById(id);
        if (person.getName()!=null && person.getEmail()!=null){
            return person.getName().charAt(0)+""+person.getEmail().charAt(0);
        }
        return null;
    }

}
