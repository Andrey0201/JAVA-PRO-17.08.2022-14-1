package com.javapro.lesson18.api;

/**
 * @author Andrii Andriutsa on 29.10.2022
 */
public interface Publisher {
  void registerListener(Subscriber subscriber);
  void removeListener(Subscriber subscriber);
  void notifyListener();
}



