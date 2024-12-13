package com.leonelfonseca.java.di.wired.autowiredoption.ctorinjection.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class CtorInjectionPerson {

  private String name = "Mary";
  private int age = 43;

  private CtorInjectionCat mittens;

  @Autowired
  public CtorInjectionPerson(CtorInjectionCat mittens) {
    this.mittens = mittens;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + ", cat=" + mittens + '}';
  }
}
