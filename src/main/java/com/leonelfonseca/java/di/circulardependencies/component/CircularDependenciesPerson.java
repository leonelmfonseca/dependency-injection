package com.leonelfonseca.java.di.circulardependencies.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Data
public class CircularDependenciesPerson {

  private String name = "Mary";
  private int age = 43;

  private CircularDependenciesCat mittens;

  /**
   * Person requests a dependency to Bean Cat, so, to create Bean Person, Spring needs first to have Bean Cat.
   */
  @Autowired
  public CircularDependenciesPerson(CircularDependenciesCat mittens) {
    this.mittens = mittens;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + ", cat=" + mittens + '}';
  }
}