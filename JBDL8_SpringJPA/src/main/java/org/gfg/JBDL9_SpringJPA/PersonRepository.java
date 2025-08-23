package org.gfg.JBDL9_SpringJPA;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Employee,Integer> {

    Employee findByName(String name);

    Employee findByNameAndEmail(String name, String email);
    Employee findByNameOrEmail(String name, String email);

    List<Employee> findByIdBetween(int start, int end);

    List<Employee> findByNameLike(String pattern);

   // Page<Employee> findByName(Pageable pageable);

    @Query("from employee where name=:name")
    Employee findByNameQuery(String name);

    //@Query("update employee e set e.email=:email where e.id=:id")
    @Query(value = "update employee e set e.email=:email where e.id=:id",nativeQuery = true)
    @Modifying
    @Transactional
    void updateEmailById(String email, int id);

}
