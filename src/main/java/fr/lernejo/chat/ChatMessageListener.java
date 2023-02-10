package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {


    void onMessage(String receivemessage){
        System.out.println(receivemessage);
    }

}
