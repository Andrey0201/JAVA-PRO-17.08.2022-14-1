package com.javapro.lesson18.service;

import com.javapro.lesson18.api.Subscriber;

/**
 * @author Andrii Andriutsa on 29.10.2022
 */
public class Listener implements Subscriber {

  private final String name;

  public Listener(String name) {
    this.name = name;
  }

  @Override
  public void update(String news) {
    System.out.println(name + " узнал новость: " + news);
  }


}
