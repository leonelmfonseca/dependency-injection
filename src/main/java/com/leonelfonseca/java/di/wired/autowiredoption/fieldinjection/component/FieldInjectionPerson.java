package com.leonelfonseca.java.di.wired.autowiredoption.fieldinjection.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class FieldInjectionPerson {

  private String name = "Mary";
  private int age = 43;

  @Autowired private FieldInjectionCat mittens;

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + ", cat=" + mittens + '}';
  }
}
