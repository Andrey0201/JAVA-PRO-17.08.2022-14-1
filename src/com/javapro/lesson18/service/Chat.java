package com.javapro.lesson18.service;


import com.javapro.lesson18.api.Publisher;
import com.javapro.lesson18.api.Subscriber;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Andrii Andriutsa on 29.10.2022
 */
public class Chat implements Publisher {

  private final List<Subscriber> subscriberList = new ArrayList<>();
  private String newsChat;


  public void setNewsChat(String news) {
    this.newsChat = news;
    notifyListener();
  }

  @Override
  public void registerListener(Subscriber subscriber) {
    subscriberList.add(subscriber);
  }

  @Override
  public void removeListener(Subscriber subscriber) {
    subscriberList.remove(subscriber);
  }

  @Override
  public void notifyListener() {
    for (Subscriber listener : subscriberList) {
      listener.update(newsChat);
    }
  }
}