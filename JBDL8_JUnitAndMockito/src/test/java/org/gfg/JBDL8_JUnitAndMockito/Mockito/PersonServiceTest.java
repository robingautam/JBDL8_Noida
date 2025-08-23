package org.gfg.JBDL8_JUnitAndMockito.Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class PersonServiceTest {

    @Autowired
    PersonService personService;

    @MockBean
    PersonRepository personRepository;

    @Spy
    ApiCall apiCall;

    @Autowired
    Person person;

    @Test
    void verifyPersonNameAndEmail() {
       // Person person = new Person();
        //person.setId(2); person.setEmail("robin@gmail.com"); person.setName("robin");
        when(personRepository.findPersonById(ArgumentMatchers.anyInt())).thenReturn(person);
        when(personRepository.findPersonById(ArgumentMatchers.any())).thenReturn(person);
        when(apiCall.getResponse()).thenReturn("Mock Response");
        String result = personService.verifyPersonNameAndEmail(4);

        System.out.println(apiCall.getResponse());
        System.out.println(apiCall.getResponse2());

        Assertions.assertEquals("rr",result);


    }
}