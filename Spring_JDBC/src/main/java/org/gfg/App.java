package org.gfg;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

    /*
        int rows = jdbcTemplate.update("INSERT INTO student (id, name, email) VALUES (?,?,?)",1, "Robin", "robin@gmail.com");
        if (rows>0){
            System.out.println("Data Inserted");
        }else {
            System.out.println("Data Not Inserted");
        }*/

      /*  int rows = jdbcTemplate.update("UPDATE student set email=? where id=?","robingautam@gmail.com",1);
        if (rows>0){
            System.out.println("Data Updated");
        }else {
            System.out.println("Data Not Updated");
        }*/


      /*List<Student> list =   jdbcTemplate.query("SELECT * from student where id=1", new RowMapper<Student>() {
           @Override
           public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
              Student student = new Student();
              student.setId(rs.getInt(1));
              student.setName(rs.getString(2));
              student.setEmail(rs.getString(3));
              return student;
           }
       });


        System.out.println(list.get(0));*/

/*
      int rows =  jdbcTemplate.update("delete from student where id=1");
        if (rows>0){
            System.out.println("Data Deleted");
        }else {
            System.out.println("Data Not Deleted");
        }
*/

      /*  for (int i=1;i<=10000;i++){
            jdbcTemplate.update("INSERT INTO student (id, name, email) VALUES (?,?,?)",i, "Robin"+i, "robin@gmail.com");
        }

        System.out.println("data inserted");*/

        long time = System.currentTimeMillis();
        jdbcTemplate.query("SELECT * from student where id=2000", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setEmail(rs.getString(3));
                return student;
            }
        });

        long current = System.currentTimeMillis();

        long diff = current-time;

        System.out.println(diff);



    }
}
