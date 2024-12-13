package com.leonelfonseca.java.di.wired.autowiredoption.fieldinjection;

import com.leonelfonseca.java.di.wired.autowiredoption.fieldinjection.component.FieldInjectionPerson;
import com.leonelfonseca.java.di.wired.autowiredoption.fieldinjection.config.FieldInjectionConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiFieldInjectionApplication {

  public static void main(String[] args) {

    System.out.println("Field Injection");
    fieldInjectionDemo();
  }

  private static void fieldInjectionDemo() {

    /** Context instantiate beans through configuration class */
    var context = new AnnotationConfigApplicationContext(FieldInjectionConfig.class);

    FieldInjectionPerson johnny = context.getBean(FieldInjectionPerson.class);

    System.out.println(johnny);
  }
}
