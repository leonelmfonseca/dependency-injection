package com.leonelfonseca.java.di.wired.directmethodwiring;

import com.leonelfonseca.java.di.unwiredoption.model.Cat;
import com.leonelfonseca.java.di.unwiredoption.model.Person;
import com.leonelfonseca.java.di.wired.directmethodwiring.config.DirectMethodWiringConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiDirectMethodWiringApplication {

  public static void main(String[] args) {

    System.out.println("Wire beans by direct method call");
    System.out.println();
    wiredBeansDemo();
  }

  private static void wiredBeansDemo() {

    /** Context instantiate beans through configuration class */
    var context = new AnnotationConfigApplicationContext(DirectMethodWiringConfig.class);

    /** Beans are available to be used */
    Person johnny = context.getBean(Person.class);
    Cat mittens = context.getBean(Cat.class);

    /**
     * Johnny and Mittens are in the context, and relationship between the person and the cat has
     * been established. The result is the has-A relationship between the two beans: "The person
     * has-A (owns) the cat."
     */
    System.out.println(johnny);

    System.out.println(mittens);
  }
}
