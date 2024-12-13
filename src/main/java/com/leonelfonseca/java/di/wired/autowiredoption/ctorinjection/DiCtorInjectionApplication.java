package com.leonelfonseca.java.di.wired.autowiredoption.ctorinjection;

import com.leonelfonseca.java.di.wired.autowiredoption.ctorinjection.component.CtorInjectionPerson;
import com.leonelfonseca.java.di.wired.autowiredoption.ctorinjection.config.CtorInjectionConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiCtorInjectionApplication {

  public static void main(String[] args) {

    System.out.println("Constructor Injection");
    ctorInjectionDemo();
    System.out.println();
  }

  private static void ctorInjectionDemo() {

    /** Context instantiate beans through configuration class */
    var context = new AnnotationConfigApplicationContext(CtorInjectionConfig.class);

    /** Beans are available to be used */
    CtorInjectionPerson johnny = context.getBean(CtorInjectionPerson.class);

    /**
     * Johnny and Mittens are in the context, however, observe that johnnies "mittens" is null,
     * which mean that there’s not yet a relationship between the instances
     */
    System.out.println(johnny);
  }
}
