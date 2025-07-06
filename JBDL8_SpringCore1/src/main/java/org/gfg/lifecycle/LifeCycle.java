package org.gfg.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle /*implements InitializingBean, DisposableBean*/ {
    String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

  /*  public void initMethod(){
        System.out.println("Initialising the DB Connection");
    }

    public void destroyMethod(){
        System.out.println("Closing the DB Connections");
    }*/

    public void doDBOperation(){
        System.out.println("performing db operation");
    }

  /*  @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialising the DB Connection");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy: Closing the DB Connections");
    }*/

// Using the bean lifecycle annotation
    @PostConstruct
    public void initMethod(){
        System.out.println("Initialising the DB Connection");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Closing the DB Connections");
    }


}
