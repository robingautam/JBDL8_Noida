package org.gfg.JBDL9_SpringJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "employee")
public class Employee {
    @Id
    int id;
    String name;
    String email;


}
