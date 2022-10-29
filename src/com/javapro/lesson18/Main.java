package com.javapro.lesson18;

import com.javapro.lesson18.service.Chat;
import com.javapro.lesson18.service.Listener;

/**
 * @author Andrii Andriutsa on 29.10.2022
 */
public class Main {

  public static void main(String[] args) {
    Chat chat = new Chat();
    Listener listener = new Listener("Andrii");
    Listener listener2 = new Listener("Ivan");

    chat.registerListener(listener);
    chat.registerListener(listener2);

    chat.setNewsChat("В бухте Севастополя уничтожены не менее трёх кораблей-носителей ракет «Калибр»");
    chat.setNewsChat("cоссияне максимально пытаются скрыть свой провал и потерю нового флагмана «Адмирал Макаров»");
    chat.removeListener(listener);

  }
}